package TreeDataStructure.Djikstra;

import java.util.ArrayList;
import java.util.List;

public class GraphDijkstra {
    private int vertices;
    public List<List<Edge>> adjacencyList;

    public GraphDijkstra(int vertices){
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight){
        adjacencyList.get(source).add(new Edge(destination, weight));
        adjacencyList.get(destination).add(new Edge(source, weight)); // Comment this for a directed graph
    }

    public void printGraph(){
        for (int i = 0; i < adjacencyList.size(); i++) {
            List<Edge> list = adjacencyList.get(i);
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : list) {
                System.out.print(" -> (" + edge.destination + ", " + edge.weight + ")");
            }
            System.out.println();
        }
    }

    public void dijkstra(int startVertex){

    }
}
