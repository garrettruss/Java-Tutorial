package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Map_Interface.HashMap;


/*

HashMap<K, V> is a part of Java’s collection since Java 1.2. This class is found in java.util package. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.

HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.  This class makes no guarantees as to the order of the map. To use this class and its methods, you need to import java.util.HashMap package or its superclass.

https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/

https://www.geeksforgeeks.org/hashtable-in-java/


*/

// Importing HashMap class
import java.util.HashMap;


public class Example {

    // Main driver method
    public static void main(String[] args) {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard add() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Print size and content of the Map
        System.out.println("Size of map is:- "
                + map.size());

        // Printing elements in object of Map
        System.out.println(map);

        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("vishal")) {

            // Mapping
            Integer a = map.get("vishal");

            // Printing value fr the corresponding key
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }
    }
    
}
