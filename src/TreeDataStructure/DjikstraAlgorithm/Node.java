package TreeDataStructure.DjikstraAlgorithm;

import java.util.List;

public class Node {
    private String value;

    private List<Edge> edges;

    public String getValue(){
        return this.value;
    }

    public List<Edge> getEdges(){
        return this.edges;
    }
}
