/*
Division has different results with integers. The / operator does integer division, which means that any remainder is lost.

It’s important to note that the int doesn’t round the decimal, but floors it.

It’s important to note that if we try to divide any number by 0, we will get an ArithmeticException error as a result.
*/
public class MultAndDivide {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal + (subtotal * tax);
        System.out.println(total);
        double perPerson = total / 4;
        System.out.println(perPerson);
    }
}