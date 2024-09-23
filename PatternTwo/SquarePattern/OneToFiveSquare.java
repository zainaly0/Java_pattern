package SquarePattern;
public class OneToFiveSquare {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= m; b++) {
                System.out.print(b + " ");
            }
            System.out.println(" ");
        }
    }
}
