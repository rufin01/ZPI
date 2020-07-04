package expression;

public class EdgeAddition extends Operation {

    public Expression node1;
    public Expression node2;

    public EdgeAddition(Expression node1, Expression node2) {
        this.node1 = node1;
        this.node2 = node2;
    }
}
