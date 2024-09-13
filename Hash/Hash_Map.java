// import java.util.HashMap;
// import java.util.Iterator;

import java.util.*;

// HashMap is used for storing array in pair of kay and value 
//it store data in unorder way/list, not necessary that data is store in the alpha ways
//whayever data you enter first or last

public class Hash_Map {
    public static void main(String[] args){
        HashMap<String, Integer> hasMap = new HashMap<>();


        // insertion, put is used for store value and update 
        hasMap.put("india", 120);
        hasMap.put("US", 30);
        hasMap.put("china", 150);


        /**
        System.out.println(hasMap);
        hasMap.put("china", 180);

        // search
        if(hasMap.containsKey("china")){
            System.out.println("key is present");
        }
        else{
            System.out.println("key is not present");
        }
        // .put, .containsKey, .get

        System.out.println(hasMap.get("chine"));    //key exists
        // System.out.println(hasMap.get("mullah"));    //key not exists

 */

        //  iteration in HashMap
        /**for(Map.Entry<String, Integer> e :hasMap.entrySet()){
            System.err.print(e.getKey());
            System.err.println(e.getValue());

        }
            */

            Set<String> keys = hasMap.keySet();
            for(String key: keys){
                System.out.println(key+  " " + hasMap.get(key));
            }


            // remove value and key from hashMap
            hasMap.remove("china");
            
    }
}