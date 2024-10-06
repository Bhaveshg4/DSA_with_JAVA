package HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    // Popular data structure due to its time complexity.
    // Time complexity is O(1) for add, delete, search.
    public static void main(String[] args) {
        // Creating HashSet
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);

        // Search -- contains
        if (set.contains(1)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        // Delete
        set.remove(2);
        System.out.println(set);

        // Size of the set, ignores duplicate elements
        System.out.println(set.size());

        // Iterator in set
        Iterator<Integer> it = set.iterator();
        //iterator has two functions : 1)hasNext, 2) next
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
