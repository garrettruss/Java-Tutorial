package Queues;

/* 
FIFO structure
The queue structure can be modeled with three primary Java functions:

.enqueue(): add a new element to the tail

To enqueue literally means “add to the queue”. In creating the .enqueue() method, that’s exactly what we’ll do.

When adding a new node to the queue, the new node is always added to the end of the queue.

If the queue is empty, the new node becomes the head and tail of the queue. (Imagine only one person is in line).
If the queue has at least one other node, the new node becomes the new tail. (Someone joins a line of people).

.dequeue(): remove the element at the head and return its value

We can add items to the tail of our queue, but when we remove them, we remove them from the head. Remember that this protocol is described as first in, first out (FIFO). The method that performs this is called .dequeue(), or “remove from the queue”.

This method removes the head node and replaces it with the following node. It also returns the head node.

If the queue has one node, when we remove it, the queue will be empty. (Imagine only one person was in line).
If the queue has more than one node, we remove the head node and reset the head to the following node. (Once the first person places their order, the next person in line moves up).
If we want to just take a peek at the head node to see what the next order is, we can use the method .peek(), which we will also implement below.

.peek(): view the value of the head without removing it

Additional helper methods will let us keep track of queue size so the queue doesn’t “overflow” or “underflow”.

.hasSpace(): returns true if the queue has space for another node
.isEmpty(): return true is size of the queue is 0

Some queues can only contain a certain number of nodes, and others have no limit. Those with a limit are called bounded queues.

To start, we will need to make additions to our Queue class to keep track of and limit size where needed.

We will add a new property to quantify the limit:

.maxSize: a numerical property that we can use to limit total queue node count
To incorporate .maxSize, we will use a tactic called constructor overloading. This will give us the option to create bounded queues as well as unbounded ones. 

For constructor overloading, we create a second Queue constructor with one argument, maxSize.

If no max size is provided, the first constructor calls the second, using this(), with its parameter set to DEFAULT_MAX_SIZE. This value is the maximum possible integer in Java. We’ll consider a queue of this size to be unbounded.

If a max size is provided, the second constructor is used automatically with the specified max size.

*/
public class Queue {

    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Define hasSpace() below
    public boolean hasSpace() {
        if (this.size < maxSize) {
            return true;
        } else {
            return false;
        }
    }

    // Define isEmpty() below
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(String data) {
        this.queue.addToTail(data);
        this.size++;
        System.out.println("Added " + data + "! Queue size is now " + this.size);
    }

    public String dequeue() {
        String data = this.queue.removeHead();
        this.size--;
        System.out.println("Removed " + data + "! Queue size is now " + this.size);
        return data;
    }

    public String peek() {
        return this.queue.head.data;
    }

    public static void main(String[] args) {

        Queue queueOne = new Queue(25);
        Queue queueTwo = new Queue(0);
        System.out.println("queueOne has space for more nodes: " + queueOne.hasSpace());
        System.out.println("queueTwo has space for more nodes: " + queueTwo.hasSpace());
        System.out.println("queueOne is empty: " + queueOne.isEmpty());
        System.out.println("queueTwo is empty: " + queueTwo.isEmpty());

    }
}