package PatternTwo.MirrorImage;

public class NumberTriangle {
    public static void main(String[] args) {
        int row = 5;
        int col = 1;
        for (int a = 1; a <= row; a++) {
            for (int b = row - a; b >= 0; b--) {
                System.out.print(" ");
            }

            for (int b = 0; b < a; b++) {
                System.out.print(col - b);

            }
            for (int s = 2; s <= a; s++) {
                System.out.print(s);
            }
            col += 1;
            System.out.println();

        }
        // for(int a = )
    }
}
