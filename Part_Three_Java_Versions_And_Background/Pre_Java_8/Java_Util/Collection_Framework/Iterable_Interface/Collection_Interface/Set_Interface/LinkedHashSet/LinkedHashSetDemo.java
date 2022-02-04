package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Collection_Framework.Iterable_Interface.Collection_Interface.Set_Interface.LinkedHashSet;

/*
The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. When the iteration order is needed to be maintained this class is used. When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. When cycling through LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted.

https://www.geeksforgeeks.org/linkedhashset-in-java-with-examples/

 */
// Java program to demonstrate the
// working of a LinkedHashSet
import java.util.*;

public class LinkedHashSetDemo {

    // Main Method
    public static void main(String args[]) {
        // Creating an empty LinkedHashSet of string type
        LinkedHashSet<String> linkedset
            = new LinkedHashSet<String>();
 
        // Adding element to LinkedHashSet
        // using add() method
        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");
 
        // Note: This will not add new element
        // as A already exists
        linkedset.add("A");
        linkedset.add("E");
 
        // Getting size of LinkedHashSet
        // using size() method
        System.out.println("Size of LinkedHashSet = "
                           + linkedset.size());
 
        System.out.println("Original LinkedHashSet:"
                           + linkedset);
 
        // Removing existing entry from above Set
        // using remove() method
        System.out.println("Removing D from LinkedHashSet: "
                           + linkedset.remove("D"));
 
        // Removing existing entry from above Set
        // that does not exist in Set
        System.out.println(
            "Trying to Remove Z which is not "
            + "present: " + linkedset.remove("Z"));
 
        // Checking for element whether it is present inside
        // Set or not using contains() method
        System.out.println("Checking if A is present="
                           + linkedset.contains("A"));
 
        // Noew lastly printing the updated LinekdHashMap
        System.out.println("Updated LinkedHashSet: "
                           + linkedset);
    
    }
}
