/*
Returns
Remember, variables can only exist in the scope that they were declared in. We can use a value outside of the method it was created in if we return it from the method.

We return a value by using the keyword return:

public int numberOfTires() {
   int tires = 4;
   // return statement
   return tires;
}
This method, called numberOfTires(), returns 4. Once the return statement is executed, the compiler exits the function. Any code that exists after the return statement in a function is ignored.

In past exercises, when creating new methods, we used the keyword void. Here, we are replacing void with int, to signify that the return type is an int.

The void keyword (which means “completely empty”) indicates that no value is returned after calling that method.

A non-void method, like numberOfTires() returns a value when it is called. We can use datatype keywords (such as int, char, etc.) to specify the type of value the method should return. The return value’s type must match the return type of the method. If the return expression is compatible with the return type, a copy of that value gets returned in a process known as return by value.

Unlike void methods, non-void methods can be used as either a variable value or as part of an expression like so:
*/


public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax() {
        double totalPrice = price + price * 0.08;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);

    }
}