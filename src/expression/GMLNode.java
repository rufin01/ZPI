package expression;

public class GMLNode extends Expression {
    public Expression point;
    public Expression vpoint;
    public Expression apoint;

    public GMLNode(GMLPoint GMLPoint, GMLPoint vpoint, GMLPoint apoint){
        this.point = GMLPoint;
        this.vpoint = vpoint;
        this.apoint = apoint;
    }

    public GMLNode(){
        this.point = new GMLPoint(0,0,0);
        this.vpoint = new GMLPoint(0,0,0);
        this.apoint = new GMLPoint(0,0,0);
    }

    public GMLNode(GMLPoint point){
        this.point = point;
    }

    public GMLNode(double x, double y, double z, float theta, float phi, float psi){
        this.point = new GMLPoint(x, y, z, theta, phi, psi);
        this.vpoint = new GMLPoint(0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint(0, 0, 0, 0, 0, 0);
    }

    public GMLNode(double x, double y, double z, long time){
        this.point = new GMLPoint(x, y, z, time);
        this.vpoint = new GMLPoint(0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint(0, 0, 0, 0, 0, 0);
    }

    public GMLNode(double x, double y, double z){
        this.point = new GMLPoint(x, y, z);
        this.vpoint = new GMLPoint(0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint(0, 0, 0, 0, 0, 0);
    }

    public Expression getPoint() {
        return point;
    }

    public void setPoint(Expression point) {
        this.point = point;
    }

    public Expression getVpoint() {
        return vpoint;
    }

    public void setVpoint(Expression vpoint) {
        this.vpoint = vpoint;
    }

    public Expression getApoint() {
        return apoint;
    }

    public void setApoint(Expression apoint) {
        this.apoint = apoint;
    }
}
