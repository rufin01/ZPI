package zpi;

import expression.GMLNode;

import java.util.ArrayList;

public class NodeXForm extends XForm {
    private GMLNode origin;
    private ArrayList<EdgeXForm> edges = new ArrayList<>();

    public ArrayList<EdgeXForm> getEdges() {
        return edges;
    }
    public void setEdges(ArrayList<EdgeXForm> edges) {
        this.edges = edges;
    }

    public GMLNode getOrigin() {
        return origin;
    }
    public void setOrigin(GMLNode origin) {
        this.origin = origin;
    }
}
