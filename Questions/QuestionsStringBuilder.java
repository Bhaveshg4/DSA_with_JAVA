public class QuestionsStringBuilder {
    public static void main(String[] args) {
        // Reverse a string
        // Ex: if string is Tony, the output will be ynoT
        StringBuilder sb = new StringBuilder("hello");
        for(int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar); // Set front character to the back character
            sb.setCharAt(back, frontChar); // Set back character to the front character
        }
        System.out.println(sb.toString()); // Print the reversed string
    }
}


// StringBuilder scn = new StringBuilder("HelloWorld");

//         char gh;
//         for(int i = scn.length() - 1; i >= 0; i--) {
//             gh = scn.charAt(i);
//             System.out.println(gh);
//         }