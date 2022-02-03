package Part_Two_Data_Structures_And_Algorithms.Recursion;

public class FactorialThree {
    public static int recursiveFactorial(int n) {
        if (n > 0) {
            return n * recursiveFactorial(n - 1);
        } else {
            return 1;
        }
    }

    public static int iterativeFactorial(int n) {
        int result = 1;

        while (n > 0) {
            result *= n;
            n -= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int recursiveSolution = recursiveFactorial(10);
        System.out.println("The recursive solution to 10! is: " + recursiveSolution);

        int iterativeSolution = iterativeFactorial(10);
        System.out.println("The iterative solution to 10! is: " + iterativeSolution);
    }
}