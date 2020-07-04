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
    private long time;

    public NodeMovementTriple(String nodeName, GMLPoint newPoint, long time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint newPoint, GMLPoint newVPoint, long time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.newVPoint = newVPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint newPoint, GMLPoint newVPoint, GMLPoint newAPoint, long time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.newVPoint = newVPoint;
        this.newAPoint = newAPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint newPoint, long time, int pointType) {
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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
