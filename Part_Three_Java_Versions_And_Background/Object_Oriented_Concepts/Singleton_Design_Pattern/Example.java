package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Singleton_Design_Pattern;


/* 
Let’s first analyze the following question:

Can we have private constructors ?

As you can easily guess, like any method we can provide access specifier to the constructor. If it’s made private, then it can only be accessed inside the class.

Do we need such ‘private constructors ‘ ?

There are various scenarios where we can use private constructors. The major ones are

Internal Constructor chaining
Singleton class design pattern
What is a Singleton class?

As the name implies, a class is said to be singleton if it limits the number of objects of that class to one.

We can’t have more than a single object for such classes.

Singleton classes are employed extensively in concepts like Networking and Database Connectivity.

Design Pattern of Singleton classes:

The constructor of singleton class would be private so there must be another way to get the instance of that class. This problem is resolved using a class member instance and a factory method to return the class member.

Below is an example in java illustrating the same:
*/
// Java program to demonstrate implementation of Singleton
// pattern using private constructors.


class MySingleton {
    static MySingleton instance = null;
    public int x = 10;

    // private constructor can't be accessed outside the class
    private MySingleton() {
    }

    // Factory method to provide the users with instances
    static public MySingleton getInstance() {
        if (instance == null)
            instance = new MySingleton();

        return instance;
    }
}

// Driver Class
class Example {
    public static void main(String args[]) {
        MySingleton a = MySingleton.getInstance();
        MySingleton b = MySingleton.getInstance();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }
}

/*
 * We changed value of a.x, value of b.x also got updated because both ‘a’ and
 * ‘b’ refer to same object, i.e., they are objects of a singleton class.
 * 
 * https://www.geeksforgeeks.org/private-constructors-and-singleton-classes-in-
 * java/
 * 
 */