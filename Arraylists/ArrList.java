// package Arraylists;
import java.util.ArrayList;
import java.util.Collection;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // System.out.println(list);
        // System.out.println(list.get(0));
        // System.out.println(list.set(0, 23));
        // System.out.println(list);
        list.add(0, 1); //for adding by index 
        list.remove(2);

        // arraylist size
        list.size();


        //loop in arrayList
        for(int a = 0; a<list.size();a++){
            System.out.println(list.get(a));
        }

        // sorting 
        Collection.sort(list);

        
    }
}
