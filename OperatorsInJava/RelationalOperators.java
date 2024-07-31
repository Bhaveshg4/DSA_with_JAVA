package OperatorsInJava;

public class RelationalOperators {
    //Relational Operators:   output is a boolean value
    /*
     * ==  two values are equal or not
     * !=  not equal to
     * >   greater than
     * <   less than
     * >=  greater or rqual to
     * <=  less than or equal to    
     */

     //Logical Operators: &&(and), || (or), !(not)
     /*
      * &&: if one statement is false, whole condition is false
        ||: if either or both statement is true, whole condition is true
        !: not qual to
      */

     
     public static void main(String[] args) {
         int a = 34;
         int b = 24;
         int c = 921;
         int d = 91;
        if (a>b) {
            System.out.println("true");
            
        }else{System.out.println("false");}
        if (c>=d) {
            System.out.println("true");
            
        }else{System.out.println("false");}

        if (3!=9) {
            System.out.println("true");
            
        }
     }
    
}
