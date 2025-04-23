public class GraphMatrix {
    private boolean[][] adjMatrix;
    private int numVertices;

    // Initialize the matrix
    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add an edge
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true; // For undirected graph
    }

    // Remove an edge
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // Check if there's an edge
    public boolean isEdge(int i, int j) {
        return adjMatrix[i][j];
    }

    // Print adjacency matrix
    public void printMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print((adjMatrix[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}