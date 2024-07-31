package Recursion.AdvQuestions;

public class reversing_a_string {
    static void printRev(String str, int idx){
        System.out.println(str.charAt(idx));
        if(idx == 0) return;
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcde";
        printRev(str, str.length()-1);
        
    }
    //time complexity = the length of string which means O(n)
    
}
