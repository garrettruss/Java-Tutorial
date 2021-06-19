public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // In order to create an object (an instance of a class), we need a constructor
    // method. The constructor is defined within the class. 
    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade", 42, .99);
        Store cookieShop = new Store("cookies", 12, 3.75);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice
                + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
}