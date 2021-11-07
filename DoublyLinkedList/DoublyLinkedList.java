package DoublyLinkedList;

public class DoublyLinkedList {

    
  public Node head;
  public Node tail;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void addToHead(String data){

    Node newHead = new Node(data);
    Node currentHead = this.head;

    if(currentHead != null){
      currentHead.setPreviousNode(newHead);
      newHead.setNextNode(currentHead);
    }
    this.head = newHead;
  if (this.tail == null) {
      this.tail = newHead;
    }

  }

  public String printList() {
    Node currentNode = this.head;
    String output = "<head> ";
    while (currentNode != null) {
      output += currentNode.data + " ";
      currentNode = currentNode.getNextNode();
    }
    output += "<tail>";
    System.out.println(output);
    return output;
  }

  public static void main(String[] args) {
    
  }



}
