public class stringOperation2 {
    public static void main(String[] args) {
        //substring function
        //a substring function takes two argument
        //1) begining index
        //2) Ending Index   substring(beg index, end index)
        String sentence = "My name is Java";
        String name = sentence.substring(11, sentence.length() //this function will return substring form 0 to sentence.length
        //if passes (0,4) //it will return the substring from 0th index to 3rd index
        //strings are immutable
        );
        System.out.println(name);
    }
}
