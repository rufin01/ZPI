package expression;

public class NodeModification extends Operation{

    public Expression node;
    public Expression pointID;
    public Expression newPoint;
    public Expression time;

    public NodeModification(Expression node, Expression pointID, Expression newPoint, Expression time) {
        this.node = node;
        this.pointID = pointID;
        this.newPoint = newPoint;
        this.time = time;
    }
}
