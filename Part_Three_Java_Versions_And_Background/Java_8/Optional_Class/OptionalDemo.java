package Part_Three_Java_Versions_And_Background.Java_8.Optional_Class;

// Java program with Optional Class
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else
            System.out.println("word is null");
    }
}

//output = word is null

/*
 * Optional is a container object which may or may not contain a non-null value.
 * You must import java.util package to use this class. If a value is present,
 * isPresent() will return true and get() will return the value. Additional
 * methods that depend on the presence or absence of a contained value are
 * provided, such as orElse() which returns a default value if value not present
 * and ifPresent() which executes a block of code if the value is present. This
 * is a value-based class, i.e their instances are :
 * 
 * Final and immutable (though may contain references to mutable objects).
 * Considered equal solely based on equals(), not based on reference
 * equality(==).
 * Do not have accessible constructors.

 */

 // https://www.baeldung.com/java-optional 