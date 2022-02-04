package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Encapsulation;

// Java program to demonstrate encapsulation
class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // get method for age to access
    // private variable geekAge
    public int getAge() {
        return geekAge;
    }

    // get method for name to access
    // private variable geekName
    public String getName() {
        return geekName;
    }

    // get method for roll to access
    // private variable geekRoll
    public int getRoll() {
        return geekRoll;
    }

    // set method for age to access
    // private variable geekage
    public void setAge(int newAge) {
        geekAge = newAge;
    }

    // set method for name to access
    // private variable geekName
    public void setName(String newName) {
        geekName = newName;
    }

    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}

/*
 * 
 * In the above program, the class Encapsulate is encapsulated as the variables
 * are declared as private. The get methods like getAge() , getName() ,
 * getRoll() are set as public, these methods are used to access these
 * variables. The setter methods like setName(), setAge(), setRoll() are also
 * declared as public and are used to set the values of the variables.
 * 
 * Advantages of Encapsulation:
 * 
 * Data Hiding: The user will have no idea about the inner implementation of the
 * class. It will not be visible to the user how the class is storing values in
 * the variables. The user will only know that we are passing the values to a
 * setter method and variables are getting initialized with that value.
 * Increased Flexibility: We can make the variables of the class read-only or
 * write-only depending on our requirement. If we wish to make the variables
 * read-only then we have to omit the setter methods like setName(), setAge(),
 * etc. from the above program or if we wish to make the variables as write-only
 * then we have to omit the get methods like getName(), getAge(), etc. from the
 * above program
 * Reusability: Encapsulation also improves the re-usability and is easy to
 * change with new requirements.
 * Testing code is easy: Encapsulated code is easy to test for unit testing.
 
 */