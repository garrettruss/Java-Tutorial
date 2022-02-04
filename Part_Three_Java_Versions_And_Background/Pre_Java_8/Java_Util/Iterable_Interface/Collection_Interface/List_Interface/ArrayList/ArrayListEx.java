package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Iterable_Interface.Collection_Interface.List_Interface.ArrayList;



// Java program to demonstrate the
// working of ArrayList
import java.io.*;
import java.util.*;

/*
The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.

A. ArrayList: ArrayList provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. Java ArrayList allows us to randomly access the list. ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases. 


*/

class ArrayListEx {

    // Main Method
    public static void main(String[] args) {

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);

        // Printing elements
        System.out.println(al);

        // Remove element at index 3
        al.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(al);

        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }
}
