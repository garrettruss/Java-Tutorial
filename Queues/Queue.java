package Queues;

/* 
FIFO structure
The queue structure can be modeled with three primary Java functions:

.enqueue(): add a new element to the tail
.dequeue(): remove the element at the head and return its value
.peek(): view the value of the head without removing it

Additional helper methods will let us keep track of queue size so the queue doesn’t “overflow” or “underflow”.

*/
public class Queue {

    public LinkedList queue;
    public int size;

    public Queue() {

        this.queue = new LinkedList();
        this.size = 0;

    }

    public static void main(String[] args) {

        Queue newQueue = new Queue();
        System.out.print("This queue has " + newQueue.size + " nodes.");

    }

}