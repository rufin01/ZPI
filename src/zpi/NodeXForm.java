package zpi;

import expression.GMLNode;
import expression.GMLNode_copy;

import java.util.ArrayList;

public class NodeXForm extends XForm {
    private GMLNode_copy origin;
    private ArrayList<EdgeXForm> edges = new ArrayList<>();

    public void updateNode(NodeMovementTriple triple){
        if(triple.getNewAPoint() != null){                                           //acceleration changed
            origin.setApoint(triple.getNewAPoint());
            if(triple.getNewPoint()==null){                                         //update static placement to actual
                origin.setPoint(new GMLPoint(this.getTx(),
                                            this.getTy(),
                                            this.getTz(),
                                            this.getRx(),
                                            this.getRy(),
                                            this.getRz(),
                                            triple.getTime()));
            }
            if(triple.getNewVPoint()==null){                                       //update velocity to actual
                long timeSpan = triple.getTime() - origin.getApoint().time;
                GMLPoint point = new GMLPoint(timeSpan*origin.getApoint().x + origin.getVpoint().x,
                                                timeSpan*origin.getApoint().y + origin.getVpoint().y,
                                                timeSpan*origin.getApoint().z + origin.getVpoint().z,
                                                timeSpan*origin.getApoint().theta + origin.getVpoint().theta,
                                                timeSpan*origin.getApoint().phi + origin.getVpoint().phi,
                                                timeSpan*origin.getApoint().psi + origin.getVpoint().psi,
                                                triple.getTime());
                origin.setVpoint(point);
            }
        }                                                                //end acceleration changed
        if(triple.getNewVPoint() != null){                               //velocity changed
            origin.setVpoint(triple.getNewVPoint());
            if(triple.getNewPoint()==null){                              //update placement to actual
                origin.setPoint(new GMLPoint(this.getTx(),
                        this.getTy(),
                        this.getTz(),
                        this.getRx(),
                        this.getRy(),
                        this.getRz(),
                        triple.getTime()));
            }
        }
        if(triple.getNewPoint() != null){                             //static placement changed
            origin.setPoint(triple.getNewPoint());
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
