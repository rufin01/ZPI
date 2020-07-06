package expression;

import java.util.HashMap;

public class GMLGraph extends Expression {

    private HashMap<String, Expression> nodes;
    private HashMap<String, Expression> edges;

    public GMLGraph(){
        this.nodes = new HashMap<String, Expression>();
        this.edges = new HashMap<String, Expression>();
    }

    public GMLGraph(HashMap<String, Expression> nodes, HashMap<String, Expression> edges){
        this.nodes = nodes;
        this.edges = edges;
    }

    public void addNode(String key, Expression node){
        this.nodes.put(key, node);
    }

    public void addEdge(String key, Expression edge){
        this.edges.put(key, edge);
    }

    public void updateNode(String key, Expression newNode){
        this.nodes.replace(key, newNode);
    }

    public void updateEdge(String key, Expression newEdge){
        this.edges.replace(key, newEdge);
    }

    public Expression getNode(String key){
        return this.nodes.get(key);
    }

    public Expression getEdge(String key){
        return this.edges.get(key);
    }

    public void delete() {
        this.nodes = new HashMap<String, Expression>();
        this.edges = new  HashMap<String, Expression>();
    }

    public void deleteNode(String key) {
        this.nodes.remove(key);
    }

    public void deleteEdge(String key) {
        this.edges.remove(key);
    }

    public void mergeGraph(GMLGraph otherGraph){
    }

    public void executeMovement(){
    }

    public HashMap<String, Expression> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<String, Expression> nodes) {
        this.nodes = nodes;
    }

    public HashMap<String, Expression> getEdges() {
        return edges;
    }

    public void setEdges(HashMap<String, Expression> edges) {
        this.edges = edges;
    }
}
