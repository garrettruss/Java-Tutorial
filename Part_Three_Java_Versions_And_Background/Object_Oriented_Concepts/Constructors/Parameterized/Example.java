package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Constructors.Parameterized;


/*
A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class with our own values, then use a parameterized constructor.
 */
// Java Program to Illustrate Working of
// Parameterized Constructor


// Class 1
class Geek {
    // data members of the class.
    String name;
    int id;

    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    Geek(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Class 2
class Example {
    // main driver method
    public static void main(String[] args) {
        // This would invoke the parameterized constructor.
        Geek geek1 = new Geek("adam", 1);
        System.out.println("GeekName :" + geek1.name
                + " and GeekId :" + geek1.id);
    }
}
