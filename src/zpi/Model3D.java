package zpi;

import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import library.GMLNode;

public class Model3D {
    final PhongMaterial RED_MATERIAL = new PhongMaterial();
    final PhongMaterial WHITE_MATERIAL = new PhongMaterial();
    final PhongMaterial GREY_MATERIAL = new PhongMaterial();
    private XForm model;
    private PhongMaterial nodeColour = RED_MATERIAL;
    private PhongMaterial edgeColour = GREY_MATERIAL;

    public Model3D(){
        RED_MATERIAL.setDiffuseColor(Color.DARKRED);
        RED_MATERIAL.setSpecularColor(Color.RED);
        WHITE_MATERIAL.setDiffuseColor(Color.WHITE);
        WHITE_MATERIAL.setSpecularColor(Color.LIGHTBLUE);
        GREY_MATERIAL.setDiffuseColor(Color.DARKGREY);
        GREY_MATERIAL.setSpecularColor(Color.GREY);
        model = new XForm();
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
        }
        for(EdgeXForm edge : nodeXForm.getEdges()){
            updateEdge(edge);
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

    public boolean nameExists(String name){
        for(Node n : model.getChildren()){
            if(((XForm)n).getId()==name){
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
