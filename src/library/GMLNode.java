package library;

public class GMLNode {
    private GMLPoint point;
    private GMLPoint vpoint;
    private GMLPoint apoint;

    public GMLNode(GMLPoint GMLPoint, GMLPoint vpoint, GMLPoint apoint){
        this.point = GMLPoint;
        this.vpoint = vpoint;
        this.apoint = apoint;
    };

    public GMLNode(GMLPoint point){
        this.point = point;
    }

    public GMLNode(double x, double y, double z, float theta, float phi, float psi, double time){
        this.point = new GMLPoint(x, y, z, theta, phi, psi, time);
        this.vpoint = new GMLPoint(0, 0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint(0, 0, 0, 0, 0, 0, 0);
    }

    public GMLNode(double x, double y, double z, double time){
        this.point = new GMLPoint(x, y, z, time);
        this.vpoint = new GMLPoint(0, 0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint(0, 0, 0, 0, 0, 0, 0);
    }

    public GMLNode(double x, double y, double z){
        this.point = new GMLPoint(x, y, z);
        this.vpoint = new GMLPoint(0, 0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint(0, 0, 0, 0, 0, 0, 0);
    }

    public GMLPoint getPoint() {
        return point;
    }

    public void setPoint(GMLPoint point) {
        this.point = point;
    }

    public GMLPoint getVpoint() {
        return vpoint;
    }

    public void setVpoint(GMLPoint vpoint) {
        this.vpoint = vpoint;
    }

    public GMLPoint getApoint() {
        return apoint;
    }

    public void setApoint(GMLPoint apoint) {
        this.apoint = apoint;
    }
}
