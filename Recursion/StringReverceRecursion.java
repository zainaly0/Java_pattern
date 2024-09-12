public class StringReverceRecursion {

    public static void printRev(String str, int lenght) {
        if (lenght == 0) {
            System.out.print(str.charAt(lenght));
            return;
        }

        System.out.print(str.charAt(lenght));
        printRev(str, lenght-1);
    }

    public static void main(String[] args) {
        String str = "mullah";

        printRev(str, str.length() - 1);
    }
}
