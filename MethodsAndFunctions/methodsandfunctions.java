public class methodsandfunctions {
    int i;
    int j;
    public static int add(int i, int j) {return i + j;}
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {int result = add(5, 3);
        System.out.println("Result of addition: " + result);
    }
}
