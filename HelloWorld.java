/*
 * Introduction to Java Welcome to the world of Java programming!
 * 
 * Programming languages enable humans to write instructions that a computer can
 * perform. With precise instructions, computers coordinate applications and
 * systems that run the modern world.
 * 
 * Sun Microsystems released the Java programming language in 1995. Java is
 * known for being simple, portable, secure, and robust. Though it was released
 * over twenty years ago, Java remains one of the most popular programming
 * languages today.
 * 
 * One reason people love Java is the Java Virtual Machine, which ensures the
 * same Java code can be run on different operating systems and platforms. Sun
 * Microsystems’ slogan for Java was “write once, run everywhere”. Programming
 * languages are composed of syntax, the specific instructions which Java
 * understands. We write syntax in files to create programs, which are executed
 * by the computer to perform the desired task.
 * 
 * Let’s start with the universal greeting for a programming language. We’ll
 * explore the syntax in the next exercise.
 * 
 * Java is classed based. Statically typed. Everything always has to be wrapped in a class. 
 * 
 * Public - access specifier meaning we can access this from anywhere in that scope.
 * Static - access modifier meaning we can call this method directly using class name without creating an instance of that object.
 * Void - the return type meaning return nothing.
 * Main - the actual method name.
 * String[] args - main method accepts only strings as argument.
 * System is a built-in Java class that contains useful tools for our programs.
 * out is short for “output”.
 * println is short for “print line”
 * 
 * Each file has one primary class named after the file. Our class name: HelloWorld and our file name: HelloWorld. Every word is capitalized.
 * Inside the class we had a main() method which lists our program task.
 * Like classes, we used curly braces to mark the beginning and end of a method.
 * 
 * We also can output information using System.out.print(). Notice that we’re using print(), not println(). Unlike System.out.println(), this type of print statement outputs everything on the same line. For example:

System.out.print("Hello ");
System.out.print("World");
The above code will have the following output:

Hello World

In this example, if you were to use print() or println() again, the new text will print immediately after World on the same line. It’s important to remember where you left your program’s “cursor”. If you use println() the cursor is moved to the next line. If you use print() the cursor stays on the same line.

Java does interpret semicolons. Semicolons are used to mark the end of a statement, one line of code that performs a single task.

The only statements we’ve seen so far are System.out.println("My message!");.

Let’s contrast statements with the curly brace, {}. Curly braces mark the scope of our classes and methods. There are no semicolons at the end of a curly brace.

Java is a compiled programming language, meaning the code we write in a .java file is transformed into byte code by a compiler before it is executed by the Java Virtual Machine on your computer.

A compiler is a program that translates human-friendly programming languages into other programming languages that computers can execute.

Previous exercises have automatically compiled and run the files for you. Off-platform development environments can also compile and run files for you, but it’s important to understand this aspect of Java development so we’ll do it ourselves.

The compiling process catches mistakes before the computer runs our code.

The Java compiler runs a series of checks while it transforms the code. Code that does not pass these checks will not be compiled.

As a reminder, we can compile a .java file from the terminal with the command:

javac HelloWorld.java

If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal.

We run the executable with the command:

java HelloWorld

Note that we leave off the .class part of the filename.

Here’s a full compilation cycle as an example:

// within the file: Welcome.java
public class Welcome {
  public static void main(String[] args) {
    System.out.println("Welcome to Codecademy's Java course!");
  }
}
We have one file: Welcome.java. We compile with the command:

javac Welcome.java
The terminal shows no errors, which indicates a successful compilation.

We now have two files:

Welcome.java, our original file with Java syntax.
Welcome.class, our compiled file with Java bytecode, ready to be executed by the Java Virtual Machine.
We can execute the compiled class with the command:

java Welcome

The following is printed to the screen:

Welcome to Codecademy's Java course!

Java Review: Putting It All Together
In this lesson, we’ve started writing our first programs in Java.

We’ve also learned rules and guidelines for how to write Java programs:

Java programs have at least one class and one main() method.
Each class represents one real-world idea.
The main() method runs the tasks of the program.
Java comments add helpful context to human readers.
Java has whitespace, curly braces, and semicolons.
Whitespace is for humans to read code easily.
Curly braces mark the scope of a class and method.
Semicolons mark the end of a statement.
Java is a compiled language.
Compiling catches mistakes in our code.
Compilers transform code into an executable class.

Java is a case-sensitive language. Case sensitivity means that syntax, the words our computer understands, must match the case. For example, the Java command for outputting text to the screen is System.out.println(). If you were to type system.out.println() or System.Out.println(), the compiler would not know that your intention was to use System or out.

All Java programs are made of at least one class. The class name must match the file: our file is HelloWorld.java and our class is HelloWorld. We capitalize every word, a style known as pascal case. Java variables and methods are named in a similar style called camel case where every word after the first is capitalized.

The curly braces, { and }, mark the scope of the class. Everything inside the curly braces is part of the class.

Every Java program must have a method called main(). A method is a sequence of tasks for the computer to execute. This main() method holds all of the instructions for our program.

System.out.println("Hello World!");
This code uses the method println() to send the text “Hello World!” to the terminal as output. println() comes from an object called out, which is responsible for various types of output. Objects are packages of state and behavior, and they’re often modeled on real-world things.

out is located within System, which is another object responsible for representing our computer within the program! We can access parts of an object with a ., which is known as dot notation.

This line of code is a statement, because it performs a single task. Statements always conclude with a semicolon.
 */

 public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}