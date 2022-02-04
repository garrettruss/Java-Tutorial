package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Inheritance.Constructor_Chaining;

/* 
Constructor chaining is the process of calling one constructor from another constructor with respect to current object. 
Constructor chaining can be done in two ways: 
 

Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.
Constructor chaining occurs through inheritance. A sub class constructor’s task is to call super class’s constructor first. This ensures that creation of sub class’s object starts with the initialization of the data members of the super class. There could be any numbers of classes in inheritance chain. Every constructor calls up the chain till class at the top is reached.
Why do we need constructor chaining ? 
This process is used when we want to perform multiple tasks in a single constructor rather than creating a code for each task in a single constructor we create a separate constructor for each task and make their chain which makes the program more readable. 

Rules of constructor chaining : 

The this() expression should always be the first line of the constructor.
There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
Constructor chaining can be achieved in any order.

*/
// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class Base {
    String name;

    // constructor 1
    Base() {
        //Invokes default constructor
        this("");
        System.out.println("No-argument constructor of" +
                " base class");
    }

    // parameterized constructor 2
    Base(String name) {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of base");
    }
}

class Derived extends Base {
    // constructor 3
    Derived() {
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
    Derived(String name) {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }

    public static void main(String args[]) {
        // calls parameterized constructor 4
        Derived obj = new Derived("test");

        // Calls No-argument constructor
        Derived obj1 = new Derived();
    }
}
