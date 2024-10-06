package HashMap;
import java.util.*;
//import java.util.HashMap;
public class Hashmap {
    //follows a key:value pair format,  where key is always unique, value can be similar
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("India", 4120);
        map.put("America", 450);
        map.put("China", 345353);

        System.out.println(map);//HashMap aare unordered 

        map.put("India", 4309);//if you put identical key again, hte value will get updated, it will not add duplicate keys

        //Search
         if(map.containsKey("Chine")){
            System.out.println("Present");
         }else{System.out.println("Not present");}

         //get function to get values also if key exists
         System.out.println(map.get("China"));// returns null if the value do not exists

         //different kind of for loop 
         int arr[] = {3,5,6,2,1,7};
         for(int val: arr){
            System.out.println(val+1);
         }
        
    }

}
