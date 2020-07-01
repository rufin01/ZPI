package zpi;

import expression.GMLNode;
import expression.GMLNode_copy;

import java.util.ArrayList;

public class NodeXForm extends XForm {
    private GMLNode_copy origin;
    private ArrayList<EdgeXForm> edges = new ArrayList<>();

    public ArrayList<EdgeXForm> getEdges() {
        return edges;
    }
    public void setEdges(ArrayList<EdgeXForm> edges) {
        this.edges = edges;
    }

    public GMLNode_copy getOrigin() {
        return origin;
    }
    public void setOrigin(GMLNode_copy origin) {
        this.origin = origin;
    }
}
