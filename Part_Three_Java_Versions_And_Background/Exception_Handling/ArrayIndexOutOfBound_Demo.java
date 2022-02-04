package Part_Three_Java_Versions_And_Background.Exception_Handling;

// Java program to demonstrate ArrayIndexOutOfBoundException
class ArrayIndexOutOfBound_Demo {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
                      // size 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
    }
}
