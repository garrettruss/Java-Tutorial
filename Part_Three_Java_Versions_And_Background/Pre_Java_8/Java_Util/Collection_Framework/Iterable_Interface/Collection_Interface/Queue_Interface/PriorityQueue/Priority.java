package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Collection_Framework.Iterable_Interface.Collection_Interface.Queue_Interface.PriorityQueue;

/* 

The most frequently used implementation of the queue interface is the PriorityQueue. 

A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority and this class is used in these cases. The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.

*/


// Java program to demonstrate the working of
// priority queue in Java
import java.util.*;

class Priority {

    // Main Method
    public static void main(String args[]) {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }
}
