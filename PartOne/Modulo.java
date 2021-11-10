/*
The modulo operator %, gives us the remainder after two numbers are divided.

Imagine we need to know whether a number is even or odd. An even number is divisible by 2.

Modulo can help! Dividing an even number by 2 will have a remainder of 0. Dividing an odd number by 2 will have a remainder of 1.
*/

public class Modulo {
    public static void main(String[] args) {
        int students = 26;
        int leftOut = students % 3;
        System.out.println(leftOut);
    }
}