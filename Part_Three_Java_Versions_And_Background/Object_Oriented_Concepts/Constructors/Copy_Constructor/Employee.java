package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Constructors.Copy_Constructor;

import java.util.Date;

/*
https://www.baeldung.com/java-copy-constructor#:~:text=A%20copy%20constructor%20in%20a,copy%20of%20an%20existing%20object.

A copy constructor in a Java class is a constructor that creates an object using another object of the same Java class.

That's helpful when we want to copy a complex object that has several fields, or when we want to make a deep copy of an existing object.
 */

 

 public class Employee {
    private int id;
    private String name;

    // To create a copy constructor, we can first declare a constructor that takes
    // an object of the same type as a parameter:

    // Then, we copy each field of the input object into the new instance:

    // What we have here is a shallow copy, which is fine since all of our fields –
    // an int and a String in this case – are either primitive types or immutable
    // types.

    
    // If the Java class has mutable fields, then we can instead make a deep copy
    // inside its copy constructor. With a deep copy, the newly created object is
    // independent of the original one because we create a distinct copy of each
    // mutable object:
    private Date startDate;


    public Employee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
        this.startDate = new Date(employee.startDate.getTime());
    }
}

/*
 * Copy constructors in Java are not inheritable by subclasses. Therefore, if we
 * try to initialize a child object from a parent class reference, we will face
 * a casting issue when cloning it with the copy constructor.
 * 
 * One way to avoid casting in the copy constructor is to create a new
 * inheritable method for both classes:
 * 
 * 
 */