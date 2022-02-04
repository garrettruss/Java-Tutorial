package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Abstraction.Interfaces_Info.Nested_Interfaces;

/* 

We can declare interfaces as member of a class or another interface. Such an interface is called as member interface or nested interface.

Interface in a class
Interfaces (or classes) can have only public and default access specifiers when declared outside any other class (Refer this for details). This interface declared in a class can either be default, public, protected not private. While implementing the interface, we mention the interface as c_name.i_name where c_name is the name of the class in which it is nested and i_name is the name of the interface itself.
*/
// Java program to demonstrate working of
// interface inside a class.


class Test {
    interface Yes {
        void show();
    }
}

class Testing implements Test.Yes {
    public void show() {
        System.out.println("show method of interface");
    }
}

class IntfClass {
    public static void main(String[] args) {
        Test.Yes obj;
        Testing t = new Testing();
        obj = t;
        obj.show();
    }
}
 //Output: show method of interface 