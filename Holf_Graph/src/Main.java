import it.itisgalileiroma.models.Edge;
import it.itisgalileiroma.models.Graph;
import it.itisgalileiroma.models.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // this is an example to create a graph "hardcoded"
        Node n = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(4);
        Node n4 = new Node(6);

        Edge e1 = new Edge(n, n2, 1);
        Edge e2 = new Edge(n2, n3, 1);

        List<Edge> edges = new ArrayList<>();
        List<Node> nodes = new ArrayList<>();

        nodes.add(n);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);

        edges.add(e1);
        edges.add(e2);

        Graph g = new Graph(nodes);
        for(Edge e : edges) {
            g.addEdge(e);
        }

    }
}