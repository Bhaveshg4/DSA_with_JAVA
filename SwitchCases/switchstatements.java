import java.util.Scanner;

public class switchstatements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        switch (num1) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;    
            default:
                System.out.println("Invalid input");
                break;
        }
        scn.close();
    }
}
