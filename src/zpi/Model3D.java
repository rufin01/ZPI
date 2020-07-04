package zpi;

import expression.GMLNode_copy;
import expression.GMLPoint_copy;
import javafx.animation.AnimationTimer;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Shape3D;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;

import java.util.ArrayList;

public class Model3D {
    final static PhongMaterial RED_MATERIAL = new PhongMaterial();
    final static PhongMaterial WHITE_MATERIAL = new PhongMaterial();
    final static PhongMaterial GREY_MATERIAL = new PhongMaterial();
    public static int SPEED_ADJUSTMENT_RATIO = 5;
    private static XForm model;
    private static ArrayList<NodeMovementTriple> movementHistory;
    private static PhongMaterial nodeColour = RED_MATERIAL;
    private static PhongMaterial edgeColour = GREY_MATERIAL;
    public static int nodeSize = 2;
    public static double edgeWidth = 0.2;
    public static long timer = 0;
    public static double actTime = 0;

    public Model3D(){
        RED_MATERIAL.setDiffuseColor(Color.DARKRED);
        RED_MATERIAL.setSpecularColor(Color.RED);
        WHITE_MATERIAL.setDiffuseColor(Color.WHITE);
        WHITE_MATERIAL.setSpecularColor(Color.LIGHTBLUE);
        GREY_MATERIAL.setDiffuseColor(Color.DARKGREY);
        GREY_MATERIAL.setSpecularColor(Color.GREY);
        model = new XForm();
        movementHistory = new ArrayList<>();
        Cylinder Xaxis = new Cylinder(0.1, 100);
        Cylinder Yaxis = new Cylinder(0.1, 100);
        Cylinder Zaxis = new Cylinder(0.1, 100);
        Xaxis.setMaterial(new PhongMaterial());
        Yaxis.setMaterial(new PhongMaterial());
        Zaxis.setMaterial(new PhongMaterial());
        ((PhongMaterial)Xaxis.getMaterial()).setDiffuseColor(Color.BLUE);
        ((PhongMaterial)Yaxis.getMaterial()).setDiffuseColor(Color.GREEN);
        ((PhongMaterial)Zaxis.getMaterial()).setDiffuseColor(Color.YELLOW);
        Xaxis.setRotationAxis(new Point3D(1,0,0));
        Yaxis.setRotationAxis(new Point3D(0,1,0));
        Zaxis.setRotationAxis(new Point3D(0,0,1));
        Xaxis.setRotate(90);
        Yaxis.setRotate(90);
        Zaxis.setRotate(90);
        model.getChildren().addAll(Xaxis, Yaxis, Zaxis);
    }

    public static void startMovement(){
        AnimationTimer animationTimer = new AnimationTimer() {
            boolean right = true;
            @Override
            public void handle(long l) {
                timer++;
                actTime= timer/SPEED_ADJUSTMENT_RATIO;
                for(NodeMovementTriple historyDataSet: movementHistory){
                    if(historyDataSet.getTime() == actTime){
                        NodeXForm nodeXForm = getNodeByName(historyDataSet.getNodeName());
                        nodeXForm.updateNode(historyDataSet);
                    }
                }
                for(Node n: model.getChildren()){
                    if(n.getClass().equals(NodeXForm.class)){
                        System.out.println("Moving node: " + n.getId());
                        NodeXForm node = (NodeXForm)n;
                        GMLPoint_copy point = node.getOrigin().getPoint();
                        GMLPoint_copy vPoint = node.getOrigin().getVpoint();
                        GMLPoint_copy aPoint = node.getOrigin().getApoint();
                        node.setTx((point.x + vPoint.x*(actTime-vPoint.time) + aPoint.x*(actTime-aPoint.time)*(actTime-aPoint.time)));
                        node.setTy((point.y + vPoint.y*(actTime-vPoint.time) + aPoint.y*(actTime-aPoint.time)*(actTime-aPoint.time)));
                        node.setTz((point.z + vPoint.z*(actTime-vPoint.time) + aPoint.z*(actTime-aPoint.time)*(actTime-aPoint.time)));
                        node.setRx((point.theta + vPoint.theta*(actTime-vPoint.time) + aPoint.theta*(actTime-aPoint.time)*(actTime-aPoint.time)));
                        node.setRy((point.phi + vPoint.phi*(actTime-vPoint.time) + aPoint.phi*(actTime-aPoint.time)*(actTime-aPoint.time)));
                        node.setRz((point.psi + vPoint.psi*(actTime-vPoint.time) + aPoint.phi*(actTime-aPoint.time)*(actTime-aPoint.time)));
                        for(EdgeXForm edge : node.getEdges()){
                            updateEdge(edge);
                        }
                    }
                }
            }
        };
        animationTimer.start();
    }

    public static boolean addNode(GMLNode_copy node, String nodeName){
        if(nameExists(nodeName))return false;
        NodeXForm nodeGroup = new NodeXForm();
        nodeGroup.setId(nodeName);
        Shape3D nodeModel = new Box(nodeSize, nodeSize, nodeSize);
        nodeModel.setMaterial(nodeColour);
        nodeGroup.setTx(node.getPoint().x);
        nodeGroup.setTy(node.getPoint().y);
        nodeGroup.setTz(node.getPoint().z);

        nodeGroup.setOrigin(node);
        nodeGroup.getChildren().add(nodeModel);
        model.getChildren().add(nodeGroup);
        return true;
    }

    public static boolean connectNodes(String node1name, String node2name, String edgeName){
        NodeXForm node1XForm = null;
        NodeXForm node2XForm = null;
        for(Node n : model.getChildren()){
            if(n.getId()==node1name){               //find 1st node
                node1XForm = (NodeXForm)n;
            }
            if(n.getId()==node2name){               //find 2nd node
                node2XForm = (NodeXForm)n;
            }
            if(n.getId()== edgeName){               //check if the new edge name is unique
                return false;
            }
        }
        if(node1XForm==null || node2XForm == null){
            return false;
        }
        else {
            Point3D origin = new Point3D(node1XForm.getTx(),
                    node1XForm.getTy(),
                    node1XForm.getTz());
            Point3D target = new Point3D(node2XForm.getTx(),
                    node2XForm.getTy(),
                    node2XForm.getTz());
            Point3D yAxis = new Point3D(0, 1, 0);
            Point3D diff = target.subtract(origin);
            double height = target.distance(origin);

            Point3D mid = target.midpoint(origin);
            Translate moveToMidpoint = new Translate(mid.getX(), mid.getY(), mid.getZ());

            Point3D axisOfRotation = diff.crossProduct(yAxis);
            double angle = Math.acos(diff.normalize().dotProduct(yAxis));
            Rotate rotateAroundCenter = new Rotate(-Math.toDegrees(angle), axisOfRotation);

            Cylinder edge = new Cylinder(edgeWidth, height);
            edge.setMaterial(edgeColour);
            edge.getTransforms().addAll(moveToMidpoint, rotateAroundCenter);

            EdgeXForm edgeXForm = new EdgeXForm();
            edgeXForm.setId(edgeName);
            edgeXForm.getChildren().add(edge);
            edgeXForm.setOriginNode(node1XForm);
            edgeXForm.setTargetNode(node2XForm);
            node1XForm.getEdges().add(edgeXForm);
            node2XForm.getEdges().add(edgeXForm);

            model.getChildren().add(edgeXForm);
            return true;
        }
    }

    public static void moveNode(String nodeName, double x, double y, double z, float theta, float phi, float psi){
        NodeXForm nodeXForm = getNodeByName(nodeName);
        if(nodeXForm==null){
            return;
        }else {
            nodeXForm.setTx(x);
            nodeXForm.setTy(y);
            nodeXForm.setTz(z);
            nodeXForm.setRotate(theta, phi, psi);
            nodeXForm.getOrigin().setPoint(new GMLPoint_copy(x, y, z, theta, phi, psi));
        }
        for(EdgeXForm edge : nodeXForm.getEdges()){
            updateEdge(edge);
        }
    }

    public static void addSpeedToNode(String nodeName, double Vx, double Vy, double Vz, float Vtheta, float Vphi, float Vpsi){
        NodeXForm nodeXForm = getNodeByName(nodeName);
        if(nodeXForm==null){
            return;
        }else {
            System.out.println("Changing speed of node: " + nodeXForm.getId());
            nodeXForm.getOrigin().setVpoint(new GMLPoint_copy(Vx, Vy, Vz, Vtheta, Vphi, Vpsi));
        }
    }

    public static void addAccelerationToNode(String nodeName, double Ax, double Ay, double Az, float Atheta, float Aphi, float Apsi){
        NodeXForm nodeXForm = getNodeByName(nodeName);
        if(nodeXForm==null){
            return;
        }else {
            nodeXForm.getOrigin().setApoint(new GMLPoint_copy(Ax, Ay, Az, Atheta, Aphi, Apsi));
        }
    }

    public static void updateEdge(EdgeXForm edge){
        Point3D origin = new Point3D(edge.getOriginNode().getTx(),
                edge.getOriginNode().getTy(),
                edge.getOriginNode().getTz());
        Point3D target = new Point3D(edge.getTargetNode().getTx(),
                edge.getTargetNode().getTy(),
                edge.getTargetNode().getTz());
        Point3D yAxis = new Point3D(0, 1, 0);
        Point3D diff = target.subtract(origin);
        double height = target.distance(origin);

        Point3D mid = target.midpoint(origin);
        Translate moveToMidpoint = new Translate(mid.getX(), mid.getY(), mid.getZ());

        Point3D axisOfRotation = diff.crossProduct(yAxis);
        double angle = Math.acos(diff.normalize().dotProduct(yAxis));
        Rotate rotateAroundCenter = new Rotate(-Math.toDegrees(angle), axisOfRotation);

        Cylinder edgeModel = new Cylinder(0.2, height);
        edgeModel.setMaterial(edgeColour);
        edgeModel.getTransforms().addAll(moveToMidpoint, rotateAroundCenter);

        edge.getChildren().clear();
        edge.getChildren().add(edgeModel);
    }

    public static void updateNode(NodeXForm node){
        node.setTx(node.getOrigin().getPoint().x);
        node.setTy(node.getOrigin().getPoint().y);
        node.setTz(node.getOrigin().getPoint().z);
    }

    public static boolean nameExists(String name){
        for(Node n : model.getChildren()){
            if(n.getId()==name){
                return true;
            }
        }
        return false;
    }

    public static NodeXForm getNodeByName(String nodeName){
        NodeXForm nodeXForm = null;
        for(Node n : model.getChildren()) {
            if (n.getId() == nodeName) {               //find 1st node
                nodeXForm = (NodeXForm) n;
            }
        }
        return nodeXForm;
    }

    public static XForm getModel() {
        return model;
    }

    public static void setModel(XForm model) {
        Model3D.model = model;
    }

    public static PhongMaterial getNodeColour() {
        return nodeColour;
    }

    public static void setNodeColour(PhongMaterial nodeColour) {
        Model3D.nodeColour = nodeColour;
    }

    public static PhongMaterial getEdgeColour() {
        return edgeColour;
    }

    public static void setEdgeColour(PhongMaterial edgeColour) {
        Model3D.edgeColour = edgeColour;
    }

    public static void addToMovementHistory(NodeMovementTriple nodeMovementTriple){
        movementHistory.add(nodeMovementTriple);
    }
}
