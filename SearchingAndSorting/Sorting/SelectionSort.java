package SearchingAndSorting.Sorting;

import java.util.Arrays; // Importing Arrays class to use Arrays.toString() method

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        // Selection sort
        //time complexity: O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) { // Changed the starting index of the inner loop
                if (arr[j] < arr[smallest]) { // Comparing with the current smallest element
                    smallest = j;
                }
            }
            // Swapping elements
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr)); // Using Arrays.toString() to print the array
    }
}
