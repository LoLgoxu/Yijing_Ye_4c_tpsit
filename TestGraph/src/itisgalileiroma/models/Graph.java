package itisgalileiroma.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * A graph is characterized by
 * a list of nodes and a list of edges
 */
public class Graph {

    private Map<String, Node> nodes; // Maps node names to Node objects
    private List<Edge> edges;       // List of edges

    public Graph() {
        nodes = new HashMap<>();
        edges = new ArrayList<>();
    }

    /**
     * Creates and/or retrieves a Node by its name.
     * @param nodeName The name of the Node
     * @return The Node object
     */
    public Node getOrCreateNode(String nodeName) {
        if (!nodes.containsKey(nodeName)) {
            Node newNode = new Node(nodeName);
            nodes.put(nodeName, newNode);
        }
        return nodes.get(nodeName);
    }

    /**
     * Adds an Edge to the graph.
     * @param source The source Node
     * @param destination The destination Node
     * @param weight The weight of the edge
     */
    public void addEdge(Node source, Node destination, int weight) {
        Edge newEdge = new Edge(source, destination, weight);
        edges.add(newEdge);
    }

    /**
     * Prints the Nodes and Edges in the graph.
     */
    public void printGraph() {
        System.out.println("Nodes:");
        for (Node node : nodes.values()) {
            System.out.println(node);
        }
        System.out.println("Edges:");
        for (Edge edge : edges) {
            System.out.println(edge);
        }
    }

    /**
     * Getters for Nodes and Edges
     */
    public List<Node> getNodes() {
        return new ArrayList<>(nodes.values());
    }

    public List<Edge> getEdges() {
        return edges;
    }

}
