package expression;

public class GMLNode extends Expression {
    public Expression point;
    public Expression vpoint;
    public Expression apoint;

    public GMLNode(Expression point, Expression vpoint, Expression apoint){
        this.point = point;
        this.vpoint = vpoint;
        this.apoint = apoint;
    }

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
