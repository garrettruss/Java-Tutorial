package Part_Two_Data_Structures_And_Algorithms.Stacks;

public class Stack {
    public LinkedList stack;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(String data) {
        if (this.hasSpace()) {
            this.stack.addToHead(data);
            this.size++;
            System.out.println("Added " + data + "! Stack size is now " + this.size);
        } else {
            throw new Error("Stack is full!");
        }

    }

    public String pop() {
        if (!this.isEmpty()) {
            String data = this.stack.removeHead();
            this.size--;
            System.out.println("Removed " + data + "! Stack size is now " + this.size);
            return data;
        } else {
            throw new Error("Stack is empty!");
        }

    }

    public String peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.stack.head.data;
        }
    }

    public static void main(String[] args) {

        Stack stackOne = new Stack(6);
        System.out.println("stackOne can have " + stackOne.maxSize + " nodes!");
        Stack stackTwo = new Stack();
        System.out.println("stackTwo can have " + stackTwo.maxSize + " nodes!");

        Stack dishes = new Stack();
        dishes.push("blue plate");
        dishes.push("white plate");
        dishes.push("yellow plate");
        System.out.println("The " + dishes.stack.head.data + " is at the top of the stack.");

        Stack bracelets = new Stack();
        bracelets.push("silver");
        bracelets.push("gold");
        bracelets.push("bronze");
        System.out.println("I decided I only want to wear the silver bracelet!");
        bracelets.pop();
        bracelets.pop();

        Stack carsInDriveWay = new Stack(3);
        carsInDriveWay.push("van");
        carsInDriveWay.push("convertible");
        carsInDriveWay.pop();

    }
}