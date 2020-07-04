package zpi;

import expression.GMLPoint;

public class NodeMovementTriple {
    final static int POINT_TYPE_POINT = 1;
    final static int POINT_TYPE_VPOINT = 2;
    final static int POINT_TYPE_APOINT = 3;

    private String nodeName;
    private GMLPoint newPoint = null;
    private GMLPoint newVPoint = null;
    private GMLPoint newAPoint = null;
    private int time;

    public NodeMovementTriple(String nodeName, GMLPoint newPoint, int time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint newPoint, GMLPoint newVPoint, int time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.newVPoint = newVPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint newPoint, GMLPoint newVPoint, GMLPoint newAPoint, int time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.newVPoint = newVPoint;
        this.newAPoint = newAPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint newPoint, int time, int pointType) {
        this.nodeName = nodeName;
        switch (pointType){
            case POINT_TYPE_POINT:
                this.newPoint = newPoint;
                break;
            case POINT_TYPE_VPOINT:
                this.newVPoint = newPoint;
                break;
            case POINT_TYPE_APOINT:
                this.newAPoint = newPoint;
                break;
        }
        this.time = time;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public GMLPoint getNewPoint() {
        return newPoint;
    }

    public void setNewPoint(GMLPoint newPoint) {
        this.newPoint = newPoint;
    }

    public GMLPoint getNewVPoint() {
        return newVPoint;
    }

    public void setNewVPoint(GMLPoint newVPoint) {
        this.newVPoint = newVPoint;
    }

    public GMLPoint getNewAPoint() {
        return newAPoint;
    }

    public void setNewAPoint(GMLPoint newAPoint) {
        this.newAPoint = newAPoint;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
