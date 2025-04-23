import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphList {
    private HashMap<Integer, List<Integer>> adjList;

    // Initialize the map
    public GraphList() {
        adjList = new HashMap<>();
    }

    // Add a vertex
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Remove a vertex
    public void removeVertex(int vertex) {
        adjList.values().forEach(e -> e.remove(Integer.valueOf(vertex)));
        adjList.remove(vertex);
    }

    // Add an edge
    public void addEdge(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // For undirected graph
    }

    // Remove an edge
    public void removeEdge(int source, int destination) {
        List<Integer> sourceList = adjList.get(source);
        List<Integer> destinationList = adjList.get(destination);
        if (sourceList != null) sourceList.remove(Integer.valueOf(destination));
        if (destinationList != null) destinationList.remove(Integer.valueOf(source));
    }

    // Print adjacency list
    public void printList() {
        for (Integer vertex : adjList.keySet()) {
            System.out.print(vertex + ": ");
            for (Integer edge : adjList.get(vertex)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }
}
