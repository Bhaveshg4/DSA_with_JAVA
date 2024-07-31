package Recursion.AdvQuestions;

public class keyPadCOmbination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printCOmbination(String str ,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        };
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printCOmbination(str,idx+1,combination+mapping.charAt(i));
        }
       
    }
    
    public static void main(String[] args) {
        
    }
    
}
