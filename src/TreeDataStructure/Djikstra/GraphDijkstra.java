package TreeDataStructure.Djikstra;

import java.util.*;

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
        int[] distances = new int[vertices]; // Distances array
        boolean[] visited = new boolean[vertices]; // Visited array
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));

        Arrays.fill(distances, Integer.MAX_VALUE); // Initialize distances to infinity
        distances[startVertex] = 0; // Distance to start vertex is 0
        priorityQueue.add(new Edge(startVertex, 0)); // Add start vertex to priority queue

        while (!priorityQueue.isEmpty()) {
            int u = priorityQueue.poll().destination; // Extract the node with the smallest distance

            if (!visited[u]) {
                visited[u] = true; // Mark the node as visited

                for (Edge edge : adjacencyList.get(u)) { // Iterate over neighbors
                    int v = edge.destination;
                    int weight = edge.weight;
                    if (!visited[v] && distances[u] + weight < distances[v]) { // If a shorter path is found
                        distances[v] = distances[u] + weight; // Update distance
                        priorityQueue.add(new Edge(v, distances[v])); // Add neighbor to priority queue
                    }
                }
            }
        }

//        printSolution(distances); // Print the shortest distances
    }
}
