package Part_One_Fundamentals;
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


So far, we’ve only been using operations on primitive types. It doesn’t make much sense to multiply Strings, or see if one String is less than the other. But what if we had two users logging into a site, and we wanted to see if their usernames were the same?

With objects, such as Strings, we can’t use the primitive equality operator. To test equality with objects, we use a built-in method called .equals(). When comparing objects, make sure to always use .equals(). == will work occasionally, but the reason why it sometimes works has to do with how objects are stored in memory.

For the purposes of this lesson (as well as good practice) remember to use .equals() instead of == when comparing objects.

To use it, we call it on one String, by using ., and pass in the String to compare against in parentheses:

String person1 = "Paul";
String person2 = "John";
String person3 = "Paul";
 
System.out.println(person1.equals(person2));
// Prints false, since "Paul" is not "John"
 
System.out.println(person1.equals(person3));
// Prints true, since "Paul" is "Paul"
*/


public class Song {
    public static void main(String[] args) {
        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        System.out.println(line1.equals(line2));
        System.out.println(line2.equals(line3));
    }
}