package zpi;

import expression.GMLPoint_copy;

public class NodeMovementTriple {
    final static int POINT_TYPE_POINT = 1;
    final static int POINT_TYPE_VPOINT = 2;
    final static int POINT_TYPE_APOINT = 3;

    private String nodeName;
    private GMLPoint_copy newPoint = null;
    private GMLPoint_copy newVPoint = null;
    private GMLPoint_copy newAPoint = null;
    private long time;

    public NodeMovementTriple(String nodeName, GMLPoint_copy newPoint, long time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint_copy newPoint, GMLPoint_copy newVPoint, long time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.newVPoint = newVPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint_copy newPoint, GMLPoint_copy newVPoint, GMLPoint_copy newAPoint, long time) {
        this.nodeName = nodeName;
        this.newPoint = newPoint;
        this.newVPoint = newVPoint;
        this.newAPoint = newAPoint;
        this.time = time;
    }

    public NodeMovementTriple(String nodeName, GMLPoint_copy newPoint, long time, int pointType) {
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
        newPoint.time = time;
        this.time = time;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public GMLPoint_copy getNewPoint() {
        return newPoint;
    }

    public void setNewPoint(GMLPoint_copy newPoint) {
        this.newPoint = newPoint;
    }

    public GMLPoint_copy getNewVPoint() {
        return newVPoint;
    }

    public void setNewVPoint(GMLPoint_copy newVPoint) {
        this.newVPoint = newVPoint;
    }

    public GMLPoint_copy getNewAPoint() {
        return newAPoint;
    }

    public void setNewAPoint(GMLPoint_copy newAPoint) {
        this.newAPoint = newAPoint;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
