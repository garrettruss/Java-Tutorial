package Part_Three_Java_Versions_And_Background.Exception_Handling;

// Java program to demonstrate NumberFormatException
class NumberFormat_Demo {
    public static void main(String args[]) {
        try {
            // "akki" is not a number
            int num = Integer.parseInt("akki");

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
