package Part_Two_Data_Structures_And_Algorithms.HashMaps;

public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String key, String value) {
        Node newHead = new Node(key, value);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String key, String value) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(key, value);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(key, value));
        }
    }

    public void removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return;
        }
        this.head = removedHead.getNextNode();
    }
}