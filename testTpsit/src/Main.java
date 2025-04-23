public class Main {
    public static void main(String[] args) {
        GraphMatrix matrix = new GraphMatrix(12);
        GraphList list = new GraphList();
        matrix.addEdge(10,10);
        matrix.addEdge(10,11);
        matrix.printMatrix();
        System.out.println(matrix.isEdge(10,11));
        matrix.removeEdge(10,11);
        System.out.println(matrix.isEdge(10,11));
        list.addEdge(1,0);
        list.addEdge(0,1);
        list.addVertex(1);
        list.addVertex(0);
        list.printList();

    }
}
