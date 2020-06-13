package zpi;

public class EdgeXForm extends XForm {
    private NodeXForm originNode;
    private NodeXForm targetNode;

    public NodeXForm getOriginNode() {
        return originNode;
    }

    public void setOriginNode(NodeXForm originNode) {
        this.originNode = originNode;
    }

    public NodeXForm getTargetNode() {
        return targetNode;
    }

    public void setTargetNode(NodeXForm targetNode) {
        this.targetNode = targetNode;
    }
}
