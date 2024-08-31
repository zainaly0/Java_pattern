package Pattern;

public class NumberPyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int a = 1; a <= n; a++) {
            for (int b = 0; b <= n - a; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
