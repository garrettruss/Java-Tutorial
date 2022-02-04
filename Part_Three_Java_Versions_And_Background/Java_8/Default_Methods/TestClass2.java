package Part_Three_Java_Versions_And_Background.Java_8.Default_Methods;

/* Another feature that was added in JDK 8 is that we can now define static methods in interfaces which can be called independently without an object. Note: these methods are not inherited.*/

// An example to show that interfaces can
// have methods from JDK 1.8 onwards
interface In1 {
    final int a = 10;

    static void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass2 implements In1 {
    // Driver Code
    public static void main(String[] args) {
        In1.display();
    }
}

//output hello