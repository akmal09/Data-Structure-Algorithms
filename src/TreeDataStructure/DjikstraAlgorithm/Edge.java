package TreeDataStructure.DjikstraAlgorithm;

public class Edge {
    public int distance;

    private Node node;

    public Edge(int distance, Node node){
        this.distance = distance;
        this.node = node;
    }

    public Node getNode(){
        return this.node;
    }
}
