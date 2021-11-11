package PartOne;
public class ScopeExample {
    public static void main(String[] args) {

        int[] myArray = { 1, 2, 3, 7 };
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            
            sum += myArray[i];
        }

        System.out.println(sum);
    }
}