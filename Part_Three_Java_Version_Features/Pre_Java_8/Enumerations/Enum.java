package Part_Three_Java_Version_Features.Pre_Java_8.Enumerations;
/* 
https://howtodoinjava.com/java/enum/enum-tutorial/


Java enum, also called Java enumeration type, is a type whose fields consist of a fixed set of constants. The very purpose of enum is to enforce compile time type safety. enum keyword is reserved keyword in Java.

Enumeration in Java is supported by reserved keyword enum. enums are a special type of class that always extends java.lang.Enum.

A simple example to create enum. As we know, generally we deal with four directions in daily life. Their names, angles and other properties are fixed. So, in programs, we can create enum for them. Syntax to create an enum is as below:
*/

public class Enum {

    public enum Direction {
        EAST, WEST, NORTH, SOUTH;
    }

    public static void main(String[] args) {
        Direction north = Direction.NORTH;

        System.out.println(north); // Prints NORTH

        /*
         * The ordinal() method returns the order of an enum instance. It represents the
         * sequence in the enum declaration, where the initial constant is assigned an
         * ordinal of '0'. It is very much like array indexes.
         
         */

         Direction.EAST.ordinal(); // 0

        Direction.NORTH.ordinal(); // 2

        // The enum values() method returns all the enum values in an enum array.

        Direction[] directions = Direction.values();

        for (Direction d : directions) {
            System.out.println(d);
        }
        //EAST
        //WEST
        //NORTH
        //SOUTH
    }
    
}
