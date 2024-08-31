package Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n - a; b++) {
                System.out.print("  ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            for (int b = 2; b <= a; b++) {
                System.out.print("* ");
            }
            // reverse 360
            System.out.println();

        }

        for (int a = 1; a <= n; a++) {
            for (int b = 2; b <= a; b++) {
                System.out.print("  ");
            }

            for (int b = 0; b <= n - a; b++) {
                System.out.print("* ");
            }

            for (int b = 1; b <= n - a; b++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
