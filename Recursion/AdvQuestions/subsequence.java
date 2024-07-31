package Recursion.AdvQuestions;

public class subsequence {
    public static void SubSequences(String str, int idx,String newString){
        if(idx ==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        SubSequences(str,idx+1,newString+currChar);
        SubSequences(str,idx+1,newString);

    }
    public static void main(String[] args) {
        String str = "abc";
        SubSequences(str, 0, "");

    }

    
}
