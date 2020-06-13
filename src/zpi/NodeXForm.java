package zpi;

import java.util.ArrayList;

public class NodeXForm extends XForm {
    private ArrayList<EdgeXForm> edges = new ArrayList<>();

    public ArrayList<EdgeXForm> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<EdgeXForm> edges) {
        this.edges = edges;
    }
}
