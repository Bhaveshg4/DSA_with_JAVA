import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        int arr[] = new int[9];    //declaring array
        int num_arr[] = {3,4,5,3,2,4,5,1,2,3}; //declaring array
        int arrlength = arr.length;    // printing length of array
        int[] arrnum = new int[20]; //declaring array
        int num_arrlength = num_arr.length;
        System.out.println(arrlength);
        System.out.println(num_arrlength);
        System.out.println(arrnum.length);



        int[] numarrnew = new int[4];
        numarrnew[0] = 12;
        numarrnew[1] = 23;
        numarrnew[2] = 34;
        numarrnew[3] = 45;

        System.out.println(numarrnew[2]);
        for(int i =0;i<4;i++){
            System.out.println(numarrnew[i]);// prints entire array
        }
        System.out.println("Enter the length of array");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] arrnumnow = new int[num];
        for(int i = 0; i < num; i++) {
            System.out.println("Enter element at index " + i + ":");
            arrnumnow[i] = scn.nextInt();
        }
        scn.close();
        for(int i=0;i<num;i++){
            System.out.println(arrnumnow[i]);
        }


        
    }
    
}
