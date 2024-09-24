package PatternTwo.MirrorImage;

public class LeftAngle {
    public static void main(String[] args) {
        // this code is used for triangle and left and right

        int n = 5;
        int m = 5;
        for (int a = 0; a < n; a++) {
            for (int b = n - a; b > 0; b--) {
                System.out.print("  ");
            }

            for (int b = 0; b <= a; b++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
