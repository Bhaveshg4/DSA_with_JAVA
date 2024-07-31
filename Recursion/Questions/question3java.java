package Recursion.Questions;
//print the sum of first n integers

public class question3java {
    public static void sumresult(int i, int n, int sum){
        if (i==n) {
            sum = sum+i;
            System.out.println(sum);
            return;
            
        }
        sum = sum+i;
        sumresult(i+1, n, sum);
       
    }
    public static void main(String[] args) {
        int n = 10;
        sumresult(1,n,0);

        
    }
    
}
