package Part_Three_Java_Versions_And_Background.Pre_Java_8.Assert;

/* 
An assertion allows testing the correctness of any assumptions that have been made in the program. An assertion is achieved using the assert statement in Java. While executing assertion, it is believed to be true. If it fails, JVM throws an error named AssertionError. It is mainly used for testing purposes during development. 

The assert statement is used with a Boolean expression and can be written in two different ways.

First way: 

assert expression;
Second way:  

assert expression1 : expression2;

By default, assertions are disabled. We need to run the code as given. The syntax for enabling assertion statement in Java source code is: 

java –ea Test
Or 

java –enableassertions Test

Assertions are mainly used to check logically impossible situations. For example, they can be used to check the state a code expects before it starts running or the state after it finishes running. Unlike normal exception/error handling, assertions are generally disabled at run-time. 

Assertions should not be used to replace error messages
Assertions should not be used to check arguments in the public methods as they may be provided by the user. Error handling should be used to handle errors provided by users.
Assertions should not be used on command line arguments.

*/
public class Assert {

    public static void main(String args[]) {
        int value = 15;
        assert value >= 20 : " Underweight";
        System.out.println("value is " + value);
    }

    
}
