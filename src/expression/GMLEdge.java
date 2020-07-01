package expression;

public class GMLEdge extends Expression {

    public Expression node1;
    public Expression node2;

    public GMLEdge(Expression node1, Expression node2){
        this.node1 = node1;
        this.node2 = node2;
    }

    public Expression getNode1() {
        return node1;
    }

    public void setNode1(GMLNode node1) {
        this.node1 = node1;
    }

    public Expression getNode2() {
        return node2;
    }

    public void setNode2(GMLNode node2) {
        this.node2 = node2;
    }
}
