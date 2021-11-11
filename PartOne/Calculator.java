package PartOne;
public class Calculator {
    public Calculator() {

    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b) {
        int sum = a - b;
        return sum;
    }

    public int multiply(int a, int b) {
        int sum = a * b;
        return sum;
    }

    public int divide(int a, int b) {
        int sum = a / b;
        return sum;
    }

    public int modulo(int a, int b) {
        int sum = a % b;
        return sum;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.multiply(5, 100));
        System.out.println(myCalculator.divide(100, 5));
        System.out.println(myCalculator.modulo(15, 5));
    }
}