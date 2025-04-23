import itisgalileiroma.utils.GraphProcessor;

public class Main {
    public static void main(String[] args) {

        // Path to the graph CSV file
        String filePath = "resources/csv_ex.csv";

        // Create a GraphProcessor
        GraphProcessor graphProcessor = new GraphProcessor();

        // Process the CSV file and create the graph
        graphProcessor.processCsvToGraph(filePath);

        // Display the created graph
        graphProcessor.printGraph();


    }
}