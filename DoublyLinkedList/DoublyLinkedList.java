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

  public void addToTail(String data) {
      Node newTail = new Node(data);
      Node currentTail = this.tail;

      if (currentTail != null) {
          currentTail.setNextNode(newTail);
          newTail.setPreviousNode(currentTail);
      }
      this.tail = newTail;
      if (this.head == null) {
          this.head = newTail;
      }
  }


  public String removeHead() {
      Node removedHead = this.head;

      if (removedHead == null) {
          return null;
      }
      this.head = removedHead.getNextNode();

      if (this.head != null) {
          this.head.setPreviousNode(null);
      }
      if (removedHead == this.tail) {
          // this.removeTail();
      }
      return removedHead.data;
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
