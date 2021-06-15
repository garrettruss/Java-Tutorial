/*
String
So far, we have learned primitive data types, which are the simplest types of data with no built-in behavior. Our programs will also use Strings, which are objects, instead of primitives. Objects have built-in behavior.

Strings hold sequences of characters. We’ve already seen instances of a String, for example, when we printed out "Hello World". There are two ways to create a String object: using a String literal or calling the String class to create a new String object.

A String literal is any sequence of characters enclosed in double-quotes (""). Like primitive-type variables, we declare a String variable by specifying the type first:

String greeting = "Hello World";
We could also create a new String object by calling the String class when declaring a String like so:

String salutations = new String("Hello World");
There are subtle differences in behavior depending on whether you create a String using a String literal or a new String object. We’ll dive into those later, but for now, we’ll almost always be using String literals.

The \" escape sequence allows us to add quotation marks " to a String value.

System.out.println("\"Hello World\"");
// Prints: "Hello World"

Using the \\ escape sequence allows us to place backslashes in our String text:
System.out.println("This is the backslash symbol: \\");
// Prints: This is the backslash symbol: \

Finally, if we place a \n escape sequence in a String, the compiler will output a new line of text:

System.out.println("Hello\nGoodbye");
/*
Prints:
Hello
Goodbye
*/


public class Song {
    public static void main(String[] args) {
        String openingLyrics = "Yesterday, all my troubles seemed so far away";
        System.out.println(openingLyrics);
    }
}