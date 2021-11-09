package HashMaps;

public class Node {
    public String key;
    public String value;
    private Node next;

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }

    public void setKeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
}