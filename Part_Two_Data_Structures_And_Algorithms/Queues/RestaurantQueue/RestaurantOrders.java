package Part_Two_Data_Structures_And_Algorithms.Queues.RestaurantQueue;

public class RestaurantOrders {

    public Queue headChef;
    public Queue sousChef;
    public Queue waitingList;

    public RestaurantOrders() {
        // Instantiate queues here
        this.headChef = new Queue(3);
        this.sousChef = new Queue(3);
        this.waitingList = new Queue();
    }

    public void assign(String[] orders) {
        for (String order : orders) {
            try {
                // Assign orders to Head Chef
                this.headChef.enqueue(order);
                System.out.println("Order for " + order + " taken by Head Chef.");

            } catch (Error e) {
                // Assign orders to Sous Chef
                if (this.sousChef.hasSpace()) {
                    this.sousChef.enqueue(order);
                    System.out.println("Head Chef is already busy! Assign " + order + " order to Sous Chef.");
                } else {
                    this.waitingList.enqueue(order);
                    System.out.println("Both chefs are busy! Add " + order + " order to the waiting list!");
                }

            }

        }
        System.out.println("-----------------");
        System.out.println("You've got only " + this.waitingList.size
                + " orders on the waiting list. Keep up the hard work chefs!");
    }

    public static void main(String[] args) {
    }
}