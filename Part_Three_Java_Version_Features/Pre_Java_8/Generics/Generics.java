package Part_Three_Java_Version_Features.Pre_Java_8.Generics;

import java.util.ArrayList;

/* 
https://www.baeldung.com/java-generics

https://www.geeksforgeeks.org/generics-in-java/

https://howtodoinjava.com/java/generics/complete-java-generics-tutorial/

https://docs.oracle.com/javase/tutorial/java/generics/index.html


JDK 5.0 introduced Java Generics with the aim of reducing bugs and adding an extra layer of abstraction over types.

In layman,s term, generics force type safety in java language.

Generics mean parameterized types. The idea is to allow type (Integer, String, … etc, and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. 
An entity such as class, interface, or method that operates on a parameterized type is called a generic entity.


Like C++, we use <> to specify parameter types in generic class creation. To create objects of a generic class, we use the following syntax. 

List<Integer> list = new LinkedList<>();

By adding the diamond operator <> containing the type, we narrow the specialization of this list to only Integer type. In other words, we specify the type held inside the list. The compiler can enforce the type at compile time.

We write generic methods with a single method declaration, and we can call them with arguments of different types. The compiler will ensure the correctness of whichever type we use.


Generic types are instantiated to form parameterized types by providing actual type arguments that replace the formal type parameters. A class like LinkedList<E> is a generic type, that has a type parameter E . Instantiations, such as LinkedList<Integer> or a LinkedList<String>, are called parameterized types, and String and Integer are the respective actual type arguments.

List<Integer> list = new ArrayList<Integer>();
 
list.add(1000);     //works fine because it is an integer
 
list.add("lokesh"); //compile time error because it is a string; 


A class is generic if it declares one or more type variables. These type variables are known as the type parameters of the class. Let’s understand with an example.
*/

// Using generics converts run time exceptions into compile time exception.

class Generics {
    public static void main(String[] args) {
        // Creating a an ArrayList with String specified
        ArrayList<String> al = new ArrayList<String>();

        al.add("Sachin");
        al.add("Rahul");

        // Typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
    }
}
