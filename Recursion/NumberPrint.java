package Recursion;

public class NumberPrint {

    public static int numPrint(int num) {
        if (num == 0) {
            return 0;
        }
        System.out.println(num);
        return numPrint(num - 1);
    }

    public static void main(String[] args) {
        numPrint(5);
    }
}