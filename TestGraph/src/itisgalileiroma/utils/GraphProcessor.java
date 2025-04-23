package itisgalileiroma.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import itisgalileiroma.models.Graph;
import itisgalileiroma.models.Node;

public class GraphProcessor {

    private Graph graph;

    public GraphProcessor() {
        this.graph = new Graph();
    }

    /**
     * Processes the CSV file to create Nodes and Edges, adding them to the Graph.
     * Assumes CSV format: sourceNode,destinationNode,weight
     * @param filePath the path to the CSV file
     */
    public void processCsvToGraph(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] rowValues = line.split(",");

                if (rowValues.length >= 2) {
                    // Extract source, destination, and (optional) weight
                    String sourceName = rowValues[0].trim();
                    String destinationName = rowValues[1].trim();
                    int weight = rowValues.length >= 3 ? Integer.parseInt(rowValues[2].trim()) : 1; // Default weight = 1

                    // Add Nodes and Edges to the graph
                    Node sourceNode = graph.getOrCreateNode(sourceName);
                    Node destinationNode = graph.getOrCreateNode(destinationName);
                    graph.addEdge(sourceNode, destinationNode, weight);
                } else {
                    System.err.println("Invalid row: " + line);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }
    }

    /**
     * Displays the Graph structure (Nodes and Edges).
     */
    public void printGraph() {
        graph.printGraph();
    }

    /**
     * Returns the populated Graph.
     * @return the Graph
     */
    public Graph getGraph() {
        return graph;
    }



}