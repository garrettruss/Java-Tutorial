package Part_Two_Data_Structures_And_Algorithms.SortingAlgorithms.BubbleSort;



import java.util.Arrays;


public class BubbleSort {

    public static int[] bubbleSort(int input[]) {
        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    System.out.println(String.format("Swapping pair %d, %d", input[i], input[i + 1]));
                    Swap.swap(input, i, i + 1);
                    System.out.println(Arrays.toString(input));
                    swapping = true;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] count_backwards = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println("Starting BubbleSort on reverse sorted: " + Arrays.toString(count_backwards));
        // Call bubble sort on reverse sorted
        bubbleSort(count_backwards);

        System.out.println("After Bubble Sort: " + Arrays.toString(count_backwards));

        int[] count_forwards = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Starting BubbleSort on sorted: " + Arrays.toString(count_forwards));
        // Call bubble sort on sorted
        bubbleSort(count_forwards);
        System.out.println("After BubbleSort: " + Arrays.toString(count_forwards));
    }
}