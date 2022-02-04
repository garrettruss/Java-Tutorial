package Part_Three_Java_Versions_And_Background.Exception_Handling;

// Java program to demonstrate working of throws
// https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/ 
class ThrowsExecp {

    // This method throws an exception
    // to be handled
    // by caller or caller
    // of caller and so on.
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    // This is a caller function
    public static void main(String args[]) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}
