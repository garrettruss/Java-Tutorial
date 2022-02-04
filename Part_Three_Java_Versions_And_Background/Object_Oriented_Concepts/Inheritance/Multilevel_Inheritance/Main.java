package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Inheritance.Multilevel_Inheritance;

/*
In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class. In the below image, class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. In Java, a class cannot directly access the grandparent’s members.
 */
// Java program to illustrate the
// concept of Multilevel inheritance


class one {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class two extends one {
    public void print_for() {
        System.out.println("for");
    }
}

class three extends two {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

// Drived class
public class Main {
    public static void main(String[] args) {
        three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
