package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Collection_Framework.Map_Interface.Sorted_Map_Interface.TreeMap;

/* 

https://www.geeksforgeeks.org/treemap-in-java/

The TreeMap in Java is used to implement Map interface and NavigableMap along with the AbstractMap Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. This proves to be an efficient way of sorting and storing the key-value pairs. The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators. The treemap implementation is not synchronized in the sense that if a map is accessed by multiple threads, concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally. 
*/

// Java Program to Demonstrate TreeMap
// using the Default Constructor

// Importing required classes
import java.util.*;
//import java.util.concurrent.*;

// Main class
// TreeMapImplementation
public class Example {

    // Method 1
    // To show TreeMap constructor
    static void Example1stConstructor() {
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        // Mapping string values to int keys
        // using put() method
        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        System.out.println("TreeMap using "
                + "TreeMap() constructor:\n");

        // Calling constructor
        Example1stConstructor();
    }
}
