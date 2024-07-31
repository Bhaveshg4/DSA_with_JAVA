//operations on String

public class StringOperations {
    public static void main(String[] args) {
        // use of charAt function
        String name = "tony";
        String lastname = "Stark";
        String fullname = name + "$" + lastname;
        System.out.println(fullname.length());

        //for printing character of string as desired
        for(int i =0; i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        System.out.println("Printing char at desired location");
        String collegename = "Shri Ramdeobaba College Of Engineering and Management \n";
        System.out.println(collegename.charAt(7));


        //compare function
        //this compare to function checks three cases
        //case1: string 1 > string 2     gives positive value
        //case2: string1==stsring2     returns 0
        //case3: string 1< string 2       gives negative value  

        String str2= "Tony";
        String str4 = "Stark";
        int comparisonResult = str2.compareTo(str4);
        if (comparisonResult == 0) {
            System.out.println("Strings are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("First string is lexicographically less than the second.");
        } else {
            System.out.println("First string is lexicographically greater than the second.");
        }


        if (new String("Tony")== new String("Tony")) {
            System.out.println("Its Equal");
        }else{System.out.println("Not Equal");}///////////  It do not works

        //this happens because the string in java programming langugae are objects.the function to store objects are different.
        
    }
    //we use compareTo function but not == because == fails in many cases

    
}
