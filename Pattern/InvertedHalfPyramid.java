package Pattern;

class InvertedHalfPyramid {
    public static void main(String[] args) {
        for (int a = 4; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}