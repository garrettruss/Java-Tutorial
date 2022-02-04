package Part_Three_Java_Versions_And_Background.Pre_Java_8.JavaBeans;


/*
https://www.geeksforgeeks.org/javabean-class-java/


JavaBeans are classes that encapsulate many objects into a single object (the bean). It is a java class that should follow following conventions:

Must implement Serializable.
It should have a public no-arg constructor.
All properties in java bean must be private with public getters and setter methods

.
*/
public class Student implements java.io.Serializable {
    private int id;
    private String name;

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}