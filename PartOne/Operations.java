/*
The order of operations dictates the order in which an expression is evaluated.

The order is as follows:

Parentheses
Multiplication
Division
Modulo
Addition
Subtraction
*/

public class Operations {
    public static void main(String[] args) {

        int expression1 = 5 % 2 - (4 * 2 - 1);
        System.out.println(expression1);

        int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
        System.out.println(expression2);

        int expression3 = 5 * 4 % 3 - 2 + 1;
        System.out.println(expression3);

    }
}