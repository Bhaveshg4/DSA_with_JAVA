package Recursion.Questions;

public class findFirstAndLastOccurrence {
    public static int first = -1;
    public static int last = -1;

    public static void FindFirstAndLastOccurrence(String str, int idx, char element) {
        if (idx >= str.length()) {
            return;
        }
        
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            }
            last = idx;
        }
        
        FindFirstAndLastOccurrence(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abacd";
        FindFirstAndLastOccurrence(str, 0, 'a');
        System.out.println("First occurrence index: " + first);
        System.out.println("Last occurrence index: " + last);
    }
}
