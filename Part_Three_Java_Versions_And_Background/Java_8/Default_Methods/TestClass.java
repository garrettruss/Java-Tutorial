package Part_Three_Java_Versions_And_Background.Java_8.Default_Methods;


/*New features added in interfaces in JDK 8

Prior to JDK 8, interface could not define implementation. We can now add default implementation for interface methods. This default implementation has special use and does not affect the intention behind interfaces.
Suppose we need to add a new function in an existing interface. Obviously the old code will not work as the classes have not implemented those new functions. So with the help of default implementation, we will give a default body for the newly added functions. Then the old codes will still work. */

// An example to show that interfaces can
// have methods from JDK 1.8 onwards
interface In1 {
    final int a = 10;

    default void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass implements In1 {
    // Driver Code
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
    }
}

//Output hello