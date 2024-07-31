public class  STRINGBUILDER {
    public static void main(String[] args) {
        // In Java, strings are immutable
        StringBuilder sb = new StringBuilder("TonyStark");
        System.out.println(sb);

        // Char at index 1
        System.out.println("Character at index 1: " + sb.charAt(1));

        // Set character at given index with desired character
        sb.setCharAt(1, 'P');
        System.out.println("After setting character at index 1 to 'P': " + sb);

        // Insert a character at an index using insert function
        sb.insert(0, 't');
        System.out.println("After inserting 't' at index 0: " + sb);

        // Delete character(s) in the string
        sb.delete(3, 4);
        System.out.println("After deleting character(s) from index 3 to 4: " + sb);

        // Append: Add characters to the end of the string
        StringBuilder sbr = new StringBuilder(); // Initialize StringBuilder with an empty string
        sbr.append('h');
        sbr.append('r');
        sbr.append('g');
        sbr.append('r');
        System.out.println("After appending characters to sbr: " + sbr);
    }

    //in case of str = str + e , str = str + el, a new string is created for every operaion but when we use
    // .append, then  the string just gets overwrite, no new strin is formed
}
