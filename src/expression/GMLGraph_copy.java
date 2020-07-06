package expression;

//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;

import java.util.HashMap;

public class GMLGraph_copy {

    private HashMap<String, GMLNode> nodes;
    private HashMap<String, GMLEdge> edges;

    public GMLGraph_copy(){
        this.nodes = new HashMap<String, GMLNode>();
        this.edges = new HashMap<String, GMLEdge>();
    }

    public GMLGraph_copy(HashMap<String, GMLNode> nodes, HashMap<String, GMLEdge> edges){
        this.nodes = nodes;
        this.edges = edges;
    }

    public void addNode(String key, GMLNode node){
        this.nodes.put(key, node);
    }

    public void addEdge(String key, GMLEdge edge){
        this.edges.put(key, edge);
    }

    public void updateNode(String key, GMLNode newNode){
        this.nodes.replace(key, newNode);
    }

    public void updateEdge(String key, GMLEdge newEdge){
        this.edges.replace(key, newEdge);
    }

    public GMLNode getNode(String key){
        return this.nodes.get(key);
    }

    public GMLEdge getEdge(String key){
        return this.edges.get(key);
    }

    public void delete() {
        this.nodes = new HashMap<String, GMLNode>();
        this.edges = new  HashMap<String, GMLEdge>();
    }

    public void deleteNode(String key) {
        this.nodes.remove(key);
    }

    public void deleteEdge(String key) {
        this.edges.remove(key);
    }

    public void mergeGraph(GMLGraph_copy otherGraph){
    }

    public void executeMovement(){
    }

    public HashMap<String, GMLNode> getNodes() {
        return nodes;
    }

    public void setNodes(HashMap<String, GMLNode> nodes) {
        this.nodes = nodes;
    }

    public HashMap<String, GMLEdge> getEdges() {
        return edges;
    }

    public void setEdges(HashMap<String, GMLEdge> edges) {
        this.edges = edges;
    }
}
