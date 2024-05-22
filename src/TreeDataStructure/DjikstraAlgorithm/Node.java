package TreeDataStructure.DjikstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String value;

    private List<Edge> edges;

    public Node(String data){
        this.value = data;
        this.edges = new ArrayList<>();
    }

    public String getValue(){
        return this.value;
    }

    public List<Edge> getEdges(){
        return this.edges;
    }

    public void addEdge(Edge edge){
        this.edges.add(edge);
    }
}
