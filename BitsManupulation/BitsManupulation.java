package BitsManupulation;

public class BitsManupulation {
    /*
     * Get: to return a single bit from a given series of bits
     * Set: to set desired bit
     * Clear: to make a bit 0
     * Update: to update a bit 1--> 0, 0--> 1
     */
    //Question: get the 3rd bit position: 2 of a number n where n = 0101 which is 5 in deciaml
    //step to solve:
    //step 1: Bit mask: 1<< i;
    //Operation: AND
    public static void main(String[] args) {

        //Set Bit question
        int number = 5;
        int position = 2;
        int bitMask = number<<position;
        if ((bitMask & number )==0
        ) {System.out.println("Bit was 0");
            
        }else{System.out.println("Bit was 1");}

        //Get Bit Question
        //Set the 2nd bit(position=1) of a number n where n = 0101 which is 5 in decimal
        //Steps to get answer:
        //Bit Mask: number<<position;
        //Operator: OR
        int number1 = 5;
        int position1 = 1;
        int bitMask1 = 1<<position1;
        int newNumber = bitMask1|number1;
        System.out.println(newNumber);



        //Clear Bit operation
        // Steps to solve:
        //Step1: Bit Mask
        //Step2: AND with NOT
        //Question: clear the 3rd bit (position:2) of  a number n where n = 0101

        int n = 5;
        int pos = 2;
        int bitmaskwe = 1<<pos;
        int notbitmask = ~(bitmaskwe);
        int newnum = notbitmask&n;
        System.out.println(newnum);
        


    }
    
    


    
}
