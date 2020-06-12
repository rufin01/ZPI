package zpi;

import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
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

    public boolean addNode(GMLNode node, String groupName){
        for(Node n : model.getChildren()){
            if(((XForm)n).getId()==groupName){
                return false;
            }
        }
        XForm nodeGroup = new XForm();
        nodeGroup.setId(groupName);
        Sphere nodeModel = new Sphere(2);
        nodeModel.setMaterial(nodeColour);
        nodeGroup.setTranslateX(node.getPoint().x);
        nodeGroup.setTranslateY(node.getPoint().y);
        nodeGroup.setTranslateZ(node.getPoint().z);

        nodeGroup.getChildren().add(nodeModel);
        model.getChildren().add(nodeGroup);
        return true;
    }

    public boolean connectNodes(String node1name, String node2name, String edgeName){
        XForm node1XForm = null;
        XForm node2XForm = null;
        for(Node n : model.getChildren()){
            if(((XForm)n).getId()==node1name){               //find 1st node
                node1XForm = (XForm)n;
            }
            if(((XForm)n).getId()==node2name){               //find 2nd node
                node2XForm = (XForm)n;
            }
            if(((XForm)n).getId()== edgeName){               //check if the new edge name is unique
                return false;
            }
        }
        if(node1XForm==null || node2XForm == null){
            return false;
        }
        else {
            Point3D origin = new Point3D(node1XForm.getTranslateX(),
                    node1XForm.getTranslateY(),
                    node1XForm.getTranslateZ());
            Point3D target = new Point3D(node2XForm.getTranslateX(),
                    node2XForm.getTranslateY(),
                    node2XForm.getTranslateZ());
            Point3D yAxis = new Point3D(0, 1, 0);
            Point3D diff = target.subtract(origin);
            double height = target.distance(origin);

            Point3D mid = target.midpoint(origin);
            Translate moveToMidpoint = new Translate(mid.getX(), mid.getY(), mid.getZ());

            Point3D axisOfRotation = diff.crossProduct(yAxis);
            double angle = Math.acos(diff.normalize().dotProduct(yAxis));
            Rotate rotateAroundCenter = new Rotate(-Math.toDegrees(angle), axisOfRotation);

            Cylinder edge = new Cylinder(0.5, height);
            edge.setMaterial(edgeColour);
            edge.getTransforms().addAll(moveToMidpoint, rotateAroundCenter);

            XForm edgeXForm = new XForm();
            edgeXForm.setId(edgeName);
            edgeXForm.getChildren().add(edge);

            model.getChildren().add(edgeXForm);
            return true;
        }
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
