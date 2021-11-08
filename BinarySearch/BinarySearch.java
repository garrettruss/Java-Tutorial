package BinarySearch;

/* 
The binary search algorithm cuts the space of searching by half during each iteration. The key step in each binary search iteration is to find the middle value of the current search space and compare it against the value we’re searching for. The mid index is the average of the first and last indices of the current search space.

*/

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = Math.floorDiv(left + right, 2);
            int midValue = arr[mid];

            if (midValue == target) {
                return mid;
            } else if (target > midValue) {
                left = mid + 1;

            } else {
                right = mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] searchable = { 1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94 };
        int target = 2;

        System.out.println(search(searchable, target));
    }

}