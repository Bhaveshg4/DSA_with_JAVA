package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> Stringlist = new ArrayList<>();
        // ArrayList<Boolean> boolList = new ArrayList<>();


        //Add Elememts
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(list);

        //Get Elememts
        System.out.println("2nd index");
        list.get(2);// get 2nd index's element

        //Add elements in between
        list.add(1,1); //1st index pr 1 add kar diya
        System.out.println(list);

        //Set elements'
        //pehle se jo element rakha hai usko change karna hai
        list.set(0,5); //make the 0th element = 5
        System.out.println(list);


        //delete element:
        list.remove(3); //Index of element to be removed
        System.out.println(list);


        //count the size of arraylist
        int sizeMain = list.size();
        System.out.println(sizeMain);


        //iterator and loops
        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);//predefined function to sort

        
        
    }
}
