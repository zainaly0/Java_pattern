
public class FindOccurenceIndex {

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        // System.out.println("abaaacdaefaah, 0, \"a\"");
        char currChar = str.charAt(idx); //a
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaaacdaefaah";
        findOccurance(str, 0, 'a');
    }

}
