package Part_Two_Data_Structures_And_Algorithms.HashMaps;

/* 
Hash maps are data structures that serve as efficient key-value stores. They are capable of assigning and retrieving data in the fastest way possible. This is because the underlying data structure that hash maps use is an array.

A value is stored at an array index determined by plugging the key into a hash function. Because we always know exactly where to find values in a hash map, we have constant access to any of the values it contains.

This quick access to values makes a hash map a good choice of data structure whenever we need to store a lot of values but need fast look-up time.

In this lesson you will create your own implementation of a hash map by building out a HashMap class. You’ll build methods to hash and compress a given key, assign an index at which to store a value, and retrieve that value.

To implement a hash map, the HashMap constructor method will create an empty array that will hold values. A hashing function will return an index in the array where the value will be stored. While going through the following exercises, remember that the purpose of this lesson is to gain a deeper understanding of the data structure rather than creating a production-quality data structure.

Hash maps are based on arrays, so whenever we create a new hash map instance, we’ll create a String array filled with null values that can be replaced with key-value pairs.

Hashing
The hashing function is the secret to efficiently storing and retrieving values in a hash map. A hashing function takes a key as input and returns an index within the hash map’s underlying array.

This function is said to be deterministic. That means the hashing function must always return the same index when given the same key. This is important because we will need to hash the key again later to retrieve the stored value. We won’t be able to do this unless our hashing function behaves in a predictable and consistent way.

Getting an integer representing an index can be done by summing the character codes, or integer representation, of all the characters in the key, a string. A variable can be used to keep track of the running total of the character codes until .hash() is finished looping over the key and the sum can be returned.

  //Compression with modular arithmetic
*/
public class HashMap {

    public LinkedList[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.hashmap[i] = new LinkedList();
        }
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        LinkedList list = this.hashmap[arrayIndex];
        if (list.head == null) {
            list.addToHead(key, value);
            return;
        }
        Node current = list.head;
        while (current != null) {
            if (current.key == key) {
                current.setKeyValue(key, value);
            }
            if (current.getNextNode() == null) {
                current.setNextNode(new Node(key, value));
                break;
            }
            current = current.getNextNode();
        }
    }

    public String retrieve(String key) {
        int arrayIndex = this.hash(key);
        Node current = this.hashmap[arrayIndex].head;
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap birdCensus = new HashMap(15);
        birdCensus.assign("mandarin duck", "Central Park Pond");
        birdCensus.assign("monk parakeet", "Brooklyn College");
        birdCensus.assign("horned owl", "Pelham Bay Park");
        System.out.println(birdCensus.retrieve("mandarin duck"));
        System.out.println(birdCensus.retrieve("monk parakeet"));
        System.out.println(birdCensus.retrieve("horned owl"));

    }
}