package RightTriangle;

public class TriangleRight {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b <= a ; b++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
