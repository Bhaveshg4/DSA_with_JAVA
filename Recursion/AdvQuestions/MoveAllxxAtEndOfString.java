package Recursion.AdvQuestions;

public class MoveAllxxAtEndOfString {
    public static void MoveAtLast(String str, int idx,int count, String newString){
        if (idx==str.length()) {
            System.out.println(newString);
            return;
            
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            MoveAtLast(str, idx+1, count, newString + newString);
        }else{
            newString = newString + currChar;  //newString = newString +currChar
            MoveAtLast(str, idx+1, count, newString);
        }

    }
    public static void main(String[] args) {
        String str = "Anixxxshxxsh";
        MoveAtLast(str, 0, 0, "");
        
    }
    
}
