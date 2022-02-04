package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Abstraction.Interfaces_Info.Nested_Interfaces;

/*
Interface in another Interface
An interface can be declared inside another interface also. We mention the interface as i_name1.i_name2 where i_name1 is the name of the interface in which it is nested and i_name2 is the name of the interface to be implemented.
 */



// Java program to demonstrate working of
// interface inside another interface.


interface Test {
    interface Yes {
        void show();
    }
}

class Testing implements Test.Yes {
    public void show() {
        System.out.println("show method of interface");
    }
}

class IntfInIntf {
    public static void main(String[] args) {
        Test.Yes obj;
        Testing t = new Testing();
        obj = t;
        obj.show();
    }
}

// show method of interface