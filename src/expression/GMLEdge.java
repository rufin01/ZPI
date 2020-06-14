package expression;

public class GMLEdge {

    private GMLNode node1;
    private GMLNode node2;


    public GMLEdge(GMLNode node1, GMLNode node2){
        this.node1 = node1;
        this.node2 = node2;
    }

    public GMLNode getNode1() {
        return node1;
    }

    public void setNode1(GMLNode node1) {
        this.node1 = node1;
    }

    public GMLNode getNode2() {
        return node2;
    }

    public void setNode2(GMLNode node2) {
        this.node2 = node2;
    }
}
