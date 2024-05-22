package TreeDataStructure.Dijkstra;

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

        printSolution(distances); // Print the shortest distances
    }

    public void dijkstraByMe(int startVertex){
        int[] distance = new int[this.vertices];
        boolean[] visited = new boolean[this.vertices];
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(visited, false);
        distance[startVertex] = 0;
        priorityQueue.add(new Edge(startVertex, 0));

        while (!priorityQueue.isEmpty()){
            int currentVertex = priorityQueue.poll().destination;
            if(!visited[currentVertex]){
                visited[currentVertex] = true;
                for (Edge edge : adjacencyList.get(currentVertex)) {
                    int curr = distance[currentVertex];
                    int destination = edge.destination;
                    int weight = edge.weight;
                    int calculation = curr + weight;
                    if (!visited[destination] && (calculation < distance[destination])) {
                        distance[destination] = calculation;
                        priorityQueue.add(new Edge(destination, distance[destination]));
                    }
                }
            }
        }

        printSolution(distance);
    }

    void printSolution(int[] distances) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " \t\t " + distances[i]);
        }
    }
}
