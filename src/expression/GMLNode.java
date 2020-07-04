package expression;

public class GMLNode extends Expression {
    public Expression point;
    public Expression vpoint;
    public Expression apoint;

    public GMLNode(Expression GMLPoint, Expression vpoint, Expression apoint){
        this.point = GMLPoint;
        this.vpoint = vpoint;
        this.apoint = apoint;
    }

    public GMLNode(Expression point){
        this.point = point;
    }

    public Expression getPoint() {
        return point;
    }

    public void setPoint(Expression point) {
        this.point = point;
    }
}
