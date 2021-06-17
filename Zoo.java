/*
The + operator, which we used for adding numbers together, can be used to concatenate Strings. In other words, we can use it to join two Strings together!

We can even use a primitive datatype as the second variable to concatenate, and Java will intelligently make it a String first:

int balance = 10000;
String message = "Your balance is: " + balance;
System.out.println(message);
This code will print:

Your balance is: 10000
public class zoo
*/

public class Zoo {
    public static void main(String[] args) {
        int animals = 12;
        String species = "zebra";
        String zooDescription = "Our zoo has " + animals + " " + species + "s!";
        System.out.println(zooDescription);

    }
}
