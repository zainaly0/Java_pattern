package JavaRevision;

public class StringInJava {
    public static void main(String[] args) {
        String name1 = "zaid";
        String name2 = "zaid";
        if(name1 == name2){ //sometime it is not working, coz of string storing in HEAP, string pool 
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(name1.compareTo(name2) == 0){       //return +value fro bigger, 0 fro equal and -value for small value
            System.out.println("equal ");
        }else{
            System.out.println("not equal");
        }

        if(new String("zaid") == new String("zaid")){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
