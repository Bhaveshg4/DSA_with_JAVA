package Recursion.Questions;
//write a code to print from 1 to 5
public class Recursion1 {
    public static void results(int m){
        if (m ==6   ) {
            return;
        }
        System.out.println(m);
        results(m+1);

        

    }
    public static void main(String[] args) {
        int num = 1;
        results(num);
    }
    
}
