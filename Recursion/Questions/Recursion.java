package Recursion.Questions;
class Resursion{
    public static void printNUmer(int n) {
        //iterations and functions are brothers in java
        if (n==0) {
            return;
        }
        else{
            System.out.println(n);
            printNUmer(n-1);  
        } }
    public static void main(String[] args) {
        int num =5;
        printNUmer(num);

//all function calls are stored in a stack data structure





        
    }
}