package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Map_Interface.LinkedHashMap;

/* 
https://www.geeksforgeeks.org/linkedhashmap-class-in-java/


The LinkedHashMap Class is just like HashMap with an additional feature of maintaining an order of elements inserted into it. HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order. 

Important Features of a LinkedHashMap are listed as follows:

A LinkedHashMap contains values based on the key. It implements the Map interface and extends the HashMap class.
It contains only unique elements.
It may have one null key and multiple null values.
It is non-synchronized.
It is the same as HashMap with an additional feature that it maintains insertion order. For example, when we run the code with a HashMap, we get a different order of elements.
Declaration:

public class LinkedHashMap<K,​V> extends HashMap<K,​V> implements Map<K,​V>
Here, K is the key Object type and V is the value Object type

K – The type of the keys in the map.
V – The type of values mapped in the map.

*/


// Java Program to Demonstrate Working of LinkedHashMap

// Importing required classes
import java.util.*;

// LinkedHashMapExample
public class Example {

    // Main driver method
    public static void main(String a[]) {

        // Creating an empty LinkedHashMap
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();

        // Adding entries in Map
        // using put() method
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "quiz.geeksforgeeks.org");

        // Printing all entries inside Map
        System.out.println(lhm);

        // Note: It prints the elements in same order
        // as they were inserted

        // Getting and printing value for a specic key
        System.out.println("Getting value for key 'one': "
                + lhm.get("one"));

        // Getting size of Map using size() method
        System.out.println("Size of the map: "
                + lhm.size());

        // Checking whether Map is empty or not
        System.out.println("Is map empty? "
                + lhm.isEmpty());

        // Using containsKey() method to check for a key
        System.out.println("Contains key 'two'? "
                + lhm.containsKey("two"));

        // Using containsKey() method to check for a value
        System.out.println(
                "Contains value 'practice.geeks"
                        + "forgeeks.org'? "
                        + lhm.containsValue("practice"
                                + ".geeksforgeeks.org"));

        // Removing entry using remove() method
        System.out.println("delete element 'one': "
                + lhm.remove("one"));

        // Printing mappings to the console
        System.out.println("Mappings of LinkedHashMap : "
                + lhm);
    }
}
