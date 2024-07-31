package SearchingAndSorting.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // insertion sort
        //O(n^2) in the worst case and O(n) in the best case. time complexity
        int[] arr = {2, 3, 4, 11, 23, 11, 0, 9};
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
