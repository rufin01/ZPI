package expression;

public class GMLNode_copy extends Expression {
    public GMLPoint_copy point;
    public GMLPoint_copy vpoint;
    public GMLPoint_copy apoint;

    public String id;

    public GMLNode_copy(GMLPoint_copy point, GMLPoint_copy vpoint, GMLPoint_copy apoint){
        this.point = point;
        this.vpoint = vpoint;
        this.apoint = apoint;

        this.id = this.toString();
    }

    public GMLNode_copy(){
        this.point = new GMLPoint_copy(0,0,0);
        this.vpoint = new GMLPoint_copy(0,0,0);
        this.apoint = new GMLPoint_copy(0,0,0);

        this.id = this.toString();
    }

    public GMLNode_copy(GMLNode_copy node){
        this.point = node.point;
        this.vpoint = node.vpoint;
        this.apoint = node.apoint;

        this.id = this.toString();
    }

    public GMLNode_copy(double x, double y, double z, double theta, double phi, double psi, long time){
        this.point = new GMLPoint_copy(x, y, z, theta, phi, psi, time);
        this.vpoint = new GMLPoint_copy(0, 0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint_copy(0, 0, 0, 0, 0, 0, 0);

        this.id = this.toString();
    }

    public GMLNode_copy(double x, double y, double z, long time){
        this.point = new GMLPoint_copy(x, y, z, time);
        this.vpoint = new GMLPoint_copy(0, 0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint_copy(0, 0, 0, 0, 0, 0, 0);

        this.id = this.toString();
    }

    public GMLNode_copy(double x, double y, double z){
        this.point = new GMLPoint_copy(x, y, z);
        this.vpoint = new GMLPoint_copy(0, 0, 0, 0, 0, 0, 0);
        this.apoint = new GMLPoint_copy(0, 0, 0, 0, 0, 0, 0);

        this.id = this.toString();
    }

    public GMLPoint_copy getPoint() {
        return point;
    }

    public void setPoint(GMLPoint_copy point) {
        this.point = point;
    }

    public GMLPoint_copy getVpoint() {
        return vpoint;
    }

    public void setVpoint(GMLPoint_copy vpoint) {
        this.vpoint = vpoint;
    }

    public GMLPoint_copy getApoint() {
        return apoint;
    }

    public void setApoint(GMLPoint_copy apoint) {
        this.apoint = apoint;
    }
}
