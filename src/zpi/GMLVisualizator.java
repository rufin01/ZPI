package zpi;

import expression.GMLNode_copy;

public interface GMLVisualizator {
    public  boolean addNode(GMLNode_copy node, String nodeName); //adds node to the model and makes it visible
    public  boolean connectNodes(String node1name, String node2name, String edgeName);//adds edge to the model and makes it visible,
                                                                                     // every edge is elastic during move
    
}
