import java.util.Scanner;

public class StringJava {
    public static void main(String[] args) {
        String name = "John";
        //spaces are a valid character in string
        String fullname  = "John Stark";
        System.out.println(name + fullname);


        try (Scanner stringInput = new Scanner(System.in)) {
            String named = stringInput.nextLine();
            System.out.println(named);
        }
        //concatenation
        String name1 = "John";
        
        String fullname1  = "John Stark";
        System.out.println(name1+fullname);
        System.out.println(fullname1.length());

    }

    
}