package BitsManupulation;
import java.util.*;
public class BitsManupulation2 {
    //Update Bit
    // updating bits from 1 --> 0, or updating bit from 0 --> 1
    //Steps to solve:
    //Step 1 (Only for 1)
    //Bit Mask: 1<<i
    //Operation: AND and NOT

    //Step 1 (Only for 0)
    //Bit Mask 1<<i
    //Operation: OR

    //Question: Update the 2nd bit(position =1) of a number n to 1.(n = 0101)
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int oper = sc.nextInt();
            int n =5;
            int pos = 1;
            int BitMask = 1<<pos;
            if (oper==1) {
                int newNumber = BitMask|n;
                System.out.println(newNumber);
                
            }else{
                int newBitMask   = ~(BitMask);
                int newNumber = newBitMask&n;
                System.out.println(newNumber);
            }
            

        sc.close();
            
        }
    
}
