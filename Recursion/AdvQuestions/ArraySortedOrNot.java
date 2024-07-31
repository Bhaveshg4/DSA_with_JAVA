package Recursion.AdvQuestions;

public class ArraySortedOrNot {
    public static boolean SortedOrNot(int arr[], int index) {
        if (index==arr.length-1) {
            return true;
        }
        if (arr[index]>arr[index+1]) {
            
        }
        if (arr[index]<arr[index+1]) {
            return SortedOrNot(arr, index+1);  
            
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        SortedOrNot(arr, 0);
        System.out.println(SortedOrNot(arr, 0));
        
    }
    
}
