package expression;

public class GMLNode extends Expression {
    private Expression point;
    private Expression vpoint;
    private Expression apoint;

    public GMLNode(Expression point, Expression vpoint, Expression apoint){
        this.point = point;
        this.vpoint = vpoint;
        this.apoint = apoint;
    }
<<<<<<< HEAD
    public GMLNode(){
        this.point = new GMLPoint(0,0,0);
        this.vpoint = new GMLPoint(0,0,0);
        this.apoint = new GMLPoint(0,0,0);
    }

    public GMLNode(GMLPoint point){
        this.point = point;
    }

    public GMLNode(double x, double y, double z, double theta, double phi, double psi, double time){
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
=======
>>>>>>> 61002803e3cfa43fb1174f93c612a6b0d08e582a

    public Expression getPoint() {
        return point;
    }

    public void setPoint(GMLPoint point) {
        this.point = point;
    }

    public Expression getVpoint() {
        return vpoint;
    }

    public void setVpoint(GMLPoint vpoint) {
        this.vpoint = vpoint;
    }

    public Expression getApoint() {
        return apoint;
    }

    public void setApoint(GMLPoint apoint) {
        this.apoint = apoint;
    }
}
