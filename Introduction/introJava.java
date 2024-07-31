import java.util.Scanner;

class introJava{
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(num);
        System.out.println("Welcome\nEmployee");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scn.close();
    }
}