package zpi;

import expression.GMLNode_copy;
import expression.GMLPoint;

import java.util.ArrayList;

public class NodeXForm extends XForm {
    private GMLNode_copy origin;
    private ArrayList<EdgeXForm> edges = new ArrayList<>();

    public void updateNode(NodeMovementTriple triple){
        if(triple.getNewPoint() != null){
            origin.setPoint(triple.getNewPoint());
        }
        if(triple.getNewVPoint() != null){
            origin.setVpoint(triple.getNewVPoint());
            if(triple.getNewPoint()==null){
                origin.setPoint(new GMLPoint(this.getTx(), this.getTy(), this.getTz(), triple.getTime()));
            }
        }
        if(triple.getNewAPoint() != null){
            origin.setApoint(triple.getNewAPoint());
        }
    }

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
