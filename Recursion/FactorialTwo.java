package Recursion;

/* 
Recursion is a computational approach where a method calls itself from within its body. Programmers use recursion when they need to perform the same action multiple times in a row until it reaches a predefined stopping point, also known as a base case.

*/

public class FactorialTwo {

    public static int recursiveFactorial(int n) {
        /*
         * you created a condition (n > 0 or n >= 1). This condition is important,
         * because it defines whether or not recursiveFactorial() calls itself. We call
         * this if block the recursive case.
         * 
         */
        if (n > 0) {
            System.out.println("Execution context: " + n);

            return n * recursiveFactorial(n - 1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        int recursiveSolution = recursiveFactorial(4);
        System.out.println(recursiveSolution);
    }
}