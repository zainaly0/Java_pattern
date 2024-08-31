package Pattern;

public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int a = 1; a <= n; a++) {

            for(int b = 1; b<=n-a; b++){
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print((a+1)-b + "");
            }
            for(int b = 2; b<=a; b++){
                System.out.print(b+ "");
            }

            System.out.println();

        }
    }
}
