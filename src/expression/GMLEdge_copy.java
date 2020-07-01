package expression;

public class GMLEdge_copy {

    private GMLNode_copy node1;
    private GMLNode_copy node2;


    public GMLEdge_copy(GMLNode_copy node1, GMLNode_copy node2){
        this.node1 = node1;
        this.node2 = node2;
    }

    public GMLNode_copy getNode1() {
        return node1;
    }

    public void setNode1(GMLNode_copy node1) {
        this.node1 = node1;
    }

    public GMLNode_copy getNode2() {
        return node2;
    }

    public void setNode2(GMLNode_copy node2) {
        this.node2 = node2;
    }
}
