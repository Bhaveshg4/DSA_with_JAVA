package Recursion.Questions;
//write a program to calculate the factorial of a given number
public class question4 {
    public static int calculateFactorial(int n){
        if (n==1|| n==0){
            return 1;
            
        }
        int fact_nm1 = calculateFactorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        
        int Resultnumber = calculateFactorial(9);
        System.out.println(Resultnumber);
    }
    
    
}
