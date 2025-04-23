package itisgalileiroma.models;

/***
 * Edge between two nodes (source and target)
 * The edge can be weighted
 */
public class Edge {

    private Node source;
    private Node destination;
    private int weight;

    public Edge(Node source, Node destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Node getSource() {
        return source;
    }

    public Node getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return source + " -> " + destination + " (Weight: " + weight + ")";
    }

}
