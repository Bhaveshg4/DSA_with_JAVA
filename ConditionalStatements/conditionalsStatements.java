import java.util.Scanner;

public class conditionalsStatements {
    public static void main(String[] args) {
        //if,else
        int a =910;
        int b=100;
        if (a>b) {
            System.out.println("Welcome");
            
        }
        else{
            System.out.println("Bye");
        }

        //if else
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        if (num1==num2) {
            System.out.println("Equal");
        }else{
            if (num1>num2) {
                System.out.println(num1 + "is greater than" + num2); 
            }else{
                System.out.println(num2 + "is greater than" + num1); 


            }
        }


        //else if
        if (num1==num2) {
            System.out.println("Equal");
        }else if (num1>num2) {
                System.out.println(num1 + "is greater than" + num2); 
            }else{
                System.out.println(num2 + "is greater than" + num1); 


            }


            
        
        scn.close();

    }
    
}
