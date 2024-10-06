package HashMap;
import java.util.*;
//import java.util.HashMap;
public class ForloopInHashMap {
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
         if(map.containsKey("China")){
            System.out.println("Present");
         }else{System.out.println("Not present");}


         //for loop in HashMap
         for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
         }// {map.entrySet} => Converts map into set

         //code to print only values
         Set<String>keys= map.keySet();
         for(String key:keys){
            System.out.println(key+" "+ map.get(key));
         }

         //To remove key,value pair together
         map.remove("China");
         System.out.println(map);






         //get function to get values also if key exists
         System.out.println(map.get("China"));// returns null if the value do not exists

        
    }

}
