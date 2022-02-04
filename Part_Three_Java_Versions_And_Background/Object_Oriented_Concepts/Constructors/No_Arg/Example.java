package Part_Three_Java_Versions_And_Background.Object_Oriented_Concepts.Constructors.No_Arg;

/*
As the name suggests it is a terminology been used to construct something in our programs. So basically if we think deeper we always were declaring variables and later initializing them. Java being object-oriented language our goal is to bring code closer to real-world where we create objects now somebody is needed to look over the construction of these objects to get to how they are internally working.

Illustration: 

Animal gorilla  = new Animal() ;

Now here gorilla is an object and cant be set to 0 or null just unlikely int, char, float, etc so basically we need to initialize these objects as per requirements. This gives birth that there can be multiple types of constructors. 

Some of the geeks now must be wondering that they are unaware of the concept still they were successfully able to run programs. The answer is simple as there exists a default constructor having an empty body which is always called automatically if no constructor is written which was the reason for the successful initialization of objects at the backend. Now you must be wondering if this constructor is calling itself automatically then why there arises the need for multiple constructors. Refer to the above illustration for same where we can imagine many attributes are associated with it and it can not be initialized with 0 or null as it will make no sense hence we get to know why default constructor body is empty and still there arises the need for something to initialize attributes of objects in the java.

Now geek moving ahead you must be wondering about this keyword and with help of it we can achieve the goal but when the scalability of code increases it becomes so tedious to initialize attributes for objects at every place required arising duplicates lines in our code. So just likely we have learned to make a function when some repetitive work is being re-used in programs, same way here we have constructors which initialize and can call over objects just by writing inside some box which we will be seeing as a syntax where this block now is responsible for initialization of objects no matter how many and at what place in the code as the corresponding constructor will be automatically called just immediately after the object is initialized. Now let us technically deep dive into the concept.

How constructors are different from methods in Java? 

Constructors must have the same name as the class within which it is defined while it is not necessary for the method in java.
Constructors do not return any type while method(s) have the return type or void if does not return any value.
Constructors are called only once at the time of Object creation while method(s) can be called any number of time.

Remember: There are certain rules for writing constructor as follows:

Constructor(s) of a class must have the same name as the class name in which it resides.
A constructor in Java can not be abstract, final, static and Synchronized.
Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.

Think of a Box. If we talk about a box class then it will have some class variables (say length, breadth, and height). But when it comes to creating its object(i.e Box will now exist in the computer’s memory), then can a box be there with no value defined for its dimensions. The answer is no. 
So constructors are used to assigning values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).

When is a Constructor called? 

Each time an object is created using a new() keyword, at least one constructor (it could be the default constructor) is invoked to assign initial values to the data members of the same class

No-argument constructor: A constructor that has no parameter is known as the default constructor. If we don’t define a constructor in a class, then the compiler creates default constructor(with no arguments) for the class. And if we write a constructor with arguments or no-arguments then the compiler does not create a default constructor. 


*/





// Java Program to illustrate calling a
// no-argument constructor


class Geek {
    int num;
    String name;

    // this would be invoked while an object
    // of that class is created.
    Geek() {
        System.out.println("Constructor called");
    }
}

class Example {
    public static void main(String[] args) {
        // this would invoke default constructor.
        Geek geek1 = new Geek();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);
    }
}
