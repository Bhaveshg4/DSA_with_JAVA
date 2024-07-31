package OperatorsInJava;

public class operators {
    public static void main(String[] args) {
        //symbols that tell compiler to do some operations
        //Arithmatic Operators: Binary: +,-,*,/,%
        //Arithmatic operators: Unary: ++(increment),--(decement)  unary: performs on only one operatus
        
        
        //Increment Operators: 
        //Pre(pehle) Increment: ++a
        //step 1: Change value
        //Step 2: use value
        int a = 20;
        int b = 230;
        b = a++;
        System.out.println(a);
        System.out.println(b);

        //Increment Operators: 
        //Post(bad mai) Increment: a++
        //step1: use value
        //step 2: change value
        int a1 = 20;
        int b1= 230;
        b = a++;
        System.out.println(a1);
        System.out.println(b1);

    }
}
