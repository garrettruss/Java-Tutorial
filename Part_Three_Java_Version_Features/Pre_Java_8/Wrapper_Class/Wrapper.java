package Part_Three_Java_Version_Features.Pre_Java_8.Wrapper_Class;

import java.util.ArrayList;
import java.util.List;

/*
https://howtodoinjava.com/java/basics/java-wrapper-classes/

In Java, we have 8 primitive data types. Java provides type wrappers, which are classes that encapsulate a primitive type within an Object.

A wrapper class wraps (encloses) around a primitive datatype and gives it an object appearance. Wherever the primitive datatype is required as an object type, this type wrapper can be used.
Wrapper classes include methods to unwrap the object and give back the data type.
The type wrappers classes are part of java.lang package.
Each primitive type has a corresponding wrapper class.

Java wrapper classes are used in scenarios –

When two methods wants to refer to the same instance of an primitive type, then pass wrapper class as method arguments.
Java Generics works only with object types and does not support primitive types.
Java Collections deal only with objects; to store a primitive type in one of these classes, you need to wrap the primitive type in a class.
When you want to refer null from data type, the you need object. Primitives cannot have null as value.

Java wrapper classes are used in scenarios –

When two methods wants to refer to the same instance of an primitive type, then pass wrapper class as method arguments.
Java Generics works only with object types and does not support primitive types.
Java Collections deal only with objects; to store a primitive type in one of these classes, you need to wrap the primitive type in a class.
When you want to refer null from data type, the you need object. Primitives cannot have null as value.


*/
public class Wrapper {

    // 1. using constructor deprecated since Java 9
   // Integer object = new Integer(10);

    Integer object = Integer.valueOf(10);

    // Converting from wrapper class to primitive type is simple. We can use the
    // corresponding instance methods to get the primitive type. e.g. intValue(),
    // doubleValue(), shortValue() etc.

 
    int val = object.intValue(); // wrapper to primitive

    // Autoboxing is the automatic conversion of the primitive types into their
    // corresponding wrapper class.

    List<Integer> integerList = new ArrayList<>(); {
        for (int i = 1; i < 10; i++) {
            integerList.add(i); // int to Integer
        }

    }
    // In given example, integerList is a List of Integers. It is not a list of
    // primitive type int values.

    // Here compiler automatically creates an Integer object from int and adds the
    // object to integerList.
 
    // Unboxing happens when the conversion happens from wrapper class to its
    // corresponding primitive type. It means we can pass or assign a wrapper object
    // to an argument or reference accepting primitive type.

    public static int sumOfEven(List<Integer> integerList) {
        int sum = 0;
        for (Integer i : integerList) {
            if (i % 2 == 0)
                sum += i; // Integer to int
        }
        return sum;
    }
}
