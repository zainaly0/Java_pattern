import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("set size is: " + set.size());
        System.out.println(set);

       Iterator it = set.iterator();
    //    it.next();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    //    it.next();
    //    it.next();

        /**
        if(set.contains(1)){
            System.out.println("set contains value");
        }
        
        if(!set.contains(6)){
            System.out.println("does not containers");
        }

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set is not coantains 1");
        }

         */


    }
}
