package Part_Two_Data_Structures_And_Algorithms.Graphs.GraphTraversal.BreadthFirstTraversal;

public class Node {

    public Vertex data;
    private Node next;

    public Node(Vertex data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }

}