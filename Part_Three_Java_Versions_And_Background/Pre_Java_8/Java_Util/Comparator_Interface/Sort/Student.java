package Part_Three_Java_Versions_And_Background.Pre_Java_8.Java_Util.Comparator_Interface.Sort;

// Java Program to Demonstrate Working of
// Comparator Interface

// Importing required classes
/*

Using comparator interface- Comparator interface is used to order the objects of a user-defined class. This interface is present in java.util package and contains 2 methods compare(Object obj1, Object obj2) and equals(Object element). Using a comparator, we can sort the elements based on data members. For instance, it may be on roll no, name, age, or anything else.

Method of Collections class for sorting List elements is used to sort the elements of List by the given comparator.  

public void sort(List list, ComparatorClass c)
To sort a given List, ComparatorClass must implement a Comparator interface.

How do the sort() method of Collections class work? 
Internally the Sort method does call Compare method of the classes it is sorting. To compare two elements, it asks “Which is greater?” Compare method returns -1, 0, or 1 to say if it is less than, equal, or greater to the other. It uses this result to then determine if they should be swapped for their sort.
*/

import java.util.*;

// Class 1
// A class to represent a Student
class Student {

    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {

        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method of Student class
    // To print student details in main()
    public String toString() {

        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
                + this.address;
    }
}

// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b) {

        return a.rollno - b.rollno;
    }
}

// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b) {

        return a.name.compareTo(b.name);
    }
}

// Class 4
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args) {

        // Creating an empty ArrayList of Student type
        ArrayList<Student> ar = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        // Display message on console for better readability
        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());

        // Display message on console for better readability
        System.out.println("\nSorted by rollno");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}

/*
 * 
 * Output
 * Unsorted
 * 111 Mayank london
 * 131 Anshul nyc
 * 121 Solanki jaipur
 * 101 Aggarwal Hongkong
 * 
 * Sorted by rollno
 * 101 Aggarwal Hongkong
 * 111 Mayank london
 * 121 Solanki jaipur
 * 131 Anshul nyc
 * 
 * Sorted by name
 * 101 Aggarwal Hongkong
 * 131 Anshul nyc
 * 111 Mayank london
 * 121 Solanki jaipur
 */