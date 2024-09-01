package JavaRevision;

public class StringBuild {
    public static void main(String[] args) {
       /**
       
        // String name = "zaid";
        // System.out.println(name.concat("mullah"));
        // System.out.println(name);

        StringBuilder sb = new StringBuilder("mullah");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(3));

        // set char at index 2
        sb.setCharAt(2, 'k');
        System.out.println(sb);

        // insert char in index 
        sb.insert(0, 'S');
        System.out.println(sb);


        // delete character from string with delete methos
        // last index is not include
        sb.delete(0, 1);
        System.out.println(sb);

        // append in string last 
        sb.append("H");
        System.out.println(sb);
 */

        String fullname = "mullah";
        StringBuffer revFullname = new StringBuffer();


        int len = fullname.length();
        for(int a = 0; a<=len-1; a++){
            char ch = fullname.charAt(len-a-1);
            
            revFullname.append(ch);
        }

        
        System.out.println(revFullname);
    }
}
