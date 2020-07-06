package expression;

//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
import org.ietf.jgss.GSSContext;

import java.lang.reflect.Type;
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

//    public GMLGraph(GMLGraph otherGraph){
//        Gson gson = new Gson();
//
//        String jsonString = gson.toJson(otherGraph.nodes);
//        Type type = new TypeToken<HashMap<String, GMLNode>>(){}.getType();
//        this.nodes = gson.fromJson(jsonString, type);
//
//        jsonString = gson.toJson(otherGraph.nodes);
//        type = new TypeToken<HashMap<String, GMLEdge>>(){}.getType();
//        this.edges = gson.fromJson(jsonString, type);
//    }

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
        // NI MOM POJENCIA CO ROBIE
    }

    public void executeMovement(){
        // NIE MAM POJECIA CO TU POWINNO BYC KURLA RAZ DWA TRZY chyba nic bo nie ma wymiaru czasu
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
