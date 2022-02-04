package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Iterable_Interface.Collection_Interface.Set_Interface.HashSet;

// Java program to demonstrate the
// working of a HashSet
import java.util.*;

/* 
The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance. No guarantee is made as to the iteration order of the set which means that the class does not guarantee the constant order of elements over time. This class permits the null element. The class also offers constant time performance for the basic operations like add, remove, contains, and size assuming the hash function disperses the elements properly among the buckets, which we shall see further in the article.  

A few important features of HashSet are: 

Implements Set Interface.
The underlying data structure for HashSet is Hashtable.
As it implements the Set Interface, duplicate values are not allowed.
Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
NULL elements are allowed in HashSet.
HashSet also implements Serializable and Cloneable interfaces.

https://www.geeksforgeeks.org/hashset-in-java/
*/
public class HashSetDemo {

    // Main Method
    public static void main(String args[]) {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
