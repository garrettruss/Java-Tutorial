package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Polymorphism.Overriding;

// Java program to illustrate the fact that
// runtime polymorphism cannot be achieved
// by data members


/* In Java, we can override methods only, not the variables(data members), so runtime polymorphism cannot be achieved by data members. For example : */
// class A
class A {
    int x = 10;
}

// class B
class B extends A {
    int x = 20;
}

// Driver class
public class ExampleTwo {
    public static void main(String args[]) {
        A a = new B(); // object of type B

        // Data member of class A will be accessed
        System.out.println(a.x);
    }
}
// Output 10
