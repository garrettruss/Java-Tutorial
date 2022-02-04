package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Polymorphism.Overriding;

// Java Program for Method Overriding
/*

Method overriding is one of the ways in which Java supports Runtime Polymorphism. Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.

When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at run time.
At run-time, it depends on the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed
A superclass reference variable can refer to a subclass object. This is also known as upcasting. Java uses this fact to resolve calls to overridden methods at run time.


Here in this program, When an object of child class is created, then the method inside the child class is called. This is because The method in the parent class is overridden by the child class. Since The method is overridden, This method has more priority than the parent method inside the child class. So, the body inside the child class is executed.
 */

// Class 1
// Helper class
class Parent {

    // Method of parent class
    void Print() {

        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class subclass1 extends Parent {

    // Method
    void Print() {
        System.out.println("subclass1");
    }
}

// Class 3
// Helper class
class subclass2 extends Parent {

    // Method
    void Print() {

        // Print statement
        System.out.println("subclass2");
    }
}

// Class 4
// Main class
class Example {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method

        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}
