package Part_Three_Java_Versions_And_Background.Java_8.Stream_API;

//a simple program to demonstrate the use of stream in java
import java.util.*;
import java.util.stream.*;

class Demo {
    public static void main(String args[]) {

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

        // create a list of String
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        // demonstration of reduce method
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println(even);
    }
}


/* Output
 * [4, 9, 16, 25]
 * [Stream]
 * [Collection, Reflection, Stream]
 * [16, 4, 9, 25]
 * 4
 * 9
 * 16
 * 25
 * 6
 * 
 * 
 * 
 * 
 * A stream consists of source followed by zero or more intermediate methods
 * combined together (pipelined) and a terminal method to process the objects
 * obtained from the source as per the methods described.
 * Stream is used to compute elements as per the pipelined methods without
 * altering the original value of the object.
 * 
 */