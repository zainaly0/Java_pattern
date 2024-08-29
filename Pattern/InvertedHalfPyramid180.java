package Pattern;

public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        int n = 4;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n - a; b++) {
                System.out.print(" ");
            }

            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
