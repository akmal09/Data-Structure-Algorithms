package TreeDataStructure.Graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String value;
    private List<Node> edges;

    public Node(String val){
        this.value = val;
        this.edges = new ArrayList<>();
    }

    public String getValue(){
        return value;
    }

    public List<Node> getEdges(){
        return edges;
    }

    public void addEdges(Node node){
        this.edges.add(node);
    }
}
