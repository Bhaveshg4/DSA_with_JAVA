package Recursion.AdvQuestions;

public class towerOfHanoi {
    public static void TowerOfHanoi(int n, String source, String auxiliary, String destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        TowerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        TowerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi(n, "Source", "Auxiliary", "Destination");
    }
}
//time complexity: O(2^n-1) = O(2^n)
