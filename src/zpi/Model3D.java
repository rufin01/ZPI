package zpi;

import expression.GMLPoint;
import javafx.animation.AnimationTimer;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import expression.GMLNode;

public class Model3D {
    final PhongMaterial RED_MATERIAL = new PhongMaterial();
    final PhongMaterial WHITE_MATERIAL = new PhongMaterial();
    final PhongMaterial GREY_MATERIAL = new PhongMaterial();
    private XForm model;
    private PhongMaterial nodeColour = RED_MATERIAL;
    private PhongMaterial edgeColour = GREY_MATERIAL;
    public static long actTime = 0;

    public Model3D(){
        RED_MATERIAL.setDiffuseColor(Color.DARKRED);
        RED_MATERIAL.setSpecularColor(Color.RED);
        WHITE_MATERIAL.setDiffuseColor(Color.WHITE);
        WHITE_MATERIAL.setSpecularColor(Color.LIGHTBLUE);
        GREY_MATERIAL.setDiffuseColor(Color.DARKGREY);
        GREY_MATERIAL.setSpecularColor(Color.GREY);
        model = new XForm();
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

    public void startMovement(){
        AnimationTimer animationTimer = new AnimationTimer() {
            boolean right = true;
            @Override
            public void handle(long l) {
                if(right){
                    actTime++;
                }else actTime--;
                for(Node n: model.getChildren()){
                    if(n.getClass().equals(NodeXForm.class)){
                        System.out.println("Moving node: " + n.getId());
                        NodeXForm node = (NodeXForm)n;
                        GMLPoint point = node.getOrigin().getPoint();
                        GMLPoint vPoint = node.getOrigin().getVpoint();
                        GMLPoint aPoint = node.getOrigin().getApoint();
                        if(actTime%10==0 && actTime!= 0){
                            right = !right;
                            addSpeedToNode("lhand",0,0,-2,0,0,0);
                            addSpeedToNode("rhand",0,0,2,0,0,0);
                            addSpeedToNode("lfeet",0,0,2,0,0,0);
                            addSpeedToNode("rfeet",0,0,-2,0,0,0);
                        }
                        node.setTx(point.x + vPoint.x*actTime + aPoint.x*actTime*actTime);
                        node.setTy(point.y + vPoint.x*actTime + aPoint.x*actTime*actTime);
                        node.setTz(point.z + vPoint.z*actTime + aPoint.z*actTime*actTime);
                        node.setRx(point.theta + vPoint.theta*actTime + aPoint.theta*actTime*actTime);
                        node.setRy(point.phi + vPoint.phi*actTime + aPoint.phi*actTime*actTime);
                        node.setRz(point.psi + vPoint.psi*actTime + aPoint.phi*actTime*actTime);
                        for(EdgeXForm edge : node.getEdges()){
                            updateEdge(edge);
                        }
                    }
                }
            }
        };
        animationTimer.start();
    }

    public boolean addNode(GMLNode node, String nodeName){
        if(nameExists(nodeName))return false;
        NodeXForm nodeGroup = new NodeXForm();
        nodeGroup.setId(nodeName);
        Sphere nodeModel = new Sphere(2);
        nodeModel.setMaterial(nodeColour);
        nodeGroup.setTx(node.getPoint().x);
        nodeGroup.setTy(node.getPoint().y);
        nodeGroup.setTz(node.getPoint().z);

        nodeGroup.setOrigin(node);
        nodeGroup.getChildren().add(nodeModel);
        model.getChildren().add(nodeGroup);
        return true;
    }

    public boolean connectNodes(String node1name, String node2name, String edgeName){
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

            Cylinder edge = new Cylinder(0.2, height);
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

    public void moveNode(String nodeName, double x, double y, double z, float theta, float phi, float psi){
        NodeXForm nodeXForm = null;
        for(Node n : model.getChildren()) {
            if (n.getId() == nodeName) {               //find 1st node
                nodeXForm = (NodeXForm) n;
            }
        }
        if(nodeXForm==null){
            return;
        }else {
            nodeXForm.setTx(x);
            nodeXForm.setTy(y);
            nodeXForm.setTz(z);
            nodeXForm.setRotate(theta, phi, psi);
            nodeXForm.getOrigin().setPoint(new GMLPoint(x, y, z, theta, phi, psi));
        }
        for(EdgeXForm edge : nodeXForm.getEdges()){
            updateEdge(edge);
        }
    }

    public void addSpeedToNode(String nodeName, double Vx, double Vy, double Vz, float Vtheta, float Vphi, float Vpsi){
        NodeXForm nodeXForm = null;
        for(Node n : model.getChildren()) {
            if (n.getId() == nodeName) {               //find 1st node
                nodeXForm = (NodeXForm) n;
            }
        }
        if(nodeXForm==null){
            return;
        }else {
            System.out.println("Changing speed of node: " + nodeXForm.getId());
            nodeXForm.getOrigin().setVpoint(new GMLPoint(Vx, Vy, Vz, Vtheta, Vphi, Vpsi));
        }
    }

    public void addAccelerationToNode(String nodeName, double Ax, double Ay, double Az, float Atheta, float Aphi, float Apsi){
        NodeXForm nodeXForm = null;
        for(Node n : model.getChildren()) {
            if (n.getId() == nodeName) {               //find 1st node
                nodeXForm = (NodeXForm) n;
            }
        }
        if(nodeXForm==null){
            return;
        }else {
            nodeXForm.getOrigin().setApoint(new GMLPoint(Ax, Ay, Az, Atheta, Aphi, Apsi));
        }
    }

    public void updateEdge(EdgeXForm edge){
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

    public void updateNode(NodeXForm node){
        node.setTx(node.getOrigin().getPoint().x);
        node.setTy(node.getOrigin().getPoint().y);
        node.setTz(node.getOrigin().getPoint().z);
    }

    public boolean nameExists(String name){
        for(Node n : model.getChildren()){
            if(n.getId()==name){
                return true;
            }
        }
        return false;
    }

    public XForm getModel() {
        return model;
    }

    public void setModel(XForm model) {
        this.model = model;
    }

    public PhongMaterial getNodeColour() {
        return nodeColour;
    }

    public void setNodeColour(PhongMaterial nodeColour) {
        this.nodeColour = nodeColour;
    }

    public PhongMaterial getEdgeColour() {
        return edgeColour;
    }

    public void setEdgeColour(PhongMaterial edgeColour) {
        this.edgeColour = edgeColour;
    }
}
