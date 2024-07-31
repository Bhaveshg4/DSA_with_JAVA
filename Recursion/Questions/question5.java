package Recursion.Questions;
//Fibonacci sequence till n terms
// 0 1 1 2 3 5 8 13
public class question5 {
    public static void fiboseries(int first, int second, int n){
        if (n==0) {
            return;
            
        }
      
        int c = first+second;
        System.out.println(c);
        fiboseries(second, c, n);


    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int num = 5;
        fiboseries(a,b,num-2);
        
    }
    
}
