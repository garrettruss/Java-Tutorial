package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Iterable_Interface.Collection_Interface.List_Interface.Vector;

/*


A vector provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. This is identical to ArrayList in terms of implementation. However, the primary difference between a vector and an ArrayList is that a Vector is synchronized and an ArrayList is non-synchronized.
*/



// Java program to demonstrate the
// working of Vector
import java.io.*;
import java.util.*;

class VectorEx {

    // Main Method
    public static void main(String[] args) {

        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the Vector
        // after deletion
        System.out.println(v);

        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}
