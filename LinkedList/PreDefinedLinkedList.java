package LinkedList;
import java.util.*;
public class PreDefinedLinkedList {//for placements
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("This");
        list.addFirst("is");
        list.addFirst("a");
        list.addFirst("unique");
        list.addFirst("list");
        list.addLast("why?");
        list.removeFirst();
        list.removeLast();
        list.remove(2);
        System.out.println(list);
        int number = list.size();
        System.out.println(number);
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i)+"->");
        }
        System.out.println("null");

    }
    
}
