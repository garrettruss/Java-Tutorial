package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Collection_Framework.Iterable_Interface.Collection_Interface.Set_Interface.Sorted_Set_Interface.Navigable_Set_Interface.TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;



/* 

https://www.geeksforgeeks.org/sortedset-java-examples/

TreeSet: TreeSet class which is implemented in the collections framework is an implementation of the SortedSet Interface and SortedSet extends Set Interface. It behaves like a simple set with the exception that it stores elements in a sorted format. TreeSet uses a tree data structure for storage. Objects are stored in sorted, ascending order. But we can iterate in descending order using method TreeSet.descendingIterator(). Let’s see how to create a sortedset object using this class.

*/

public class Treeset {

    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<String>();

        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        // Adding the duplicate
        // element
        ts.add("India");

        // Displaying the TreeSet
        System.out.println(ts);

        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + ts);

        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
    
}
