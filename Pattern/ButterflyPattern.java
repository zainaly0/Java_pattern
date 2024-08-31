package Pattern;

class ButterflyPattern {
    public static void main(String[] args) {
        int input = 4;
        int n = input * 2;
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            int space = 2 * (input - a);
            for (int b = 1; b <= space; b++) {
                System.out.print("  ");
            }
            for(int b = 1; b<=a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int a = 4; a >= 1; a--) {
            for (int b = a; b >=1; b--) {
                System.out.print("* ");
            }
            int space = 2 * (input - a);
            for (int b = space; b >= 1; b--) {
                System.out.print("  ");
            }
            for(int b = a; b>=1; b--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
