package Pattern;

public class FloydTriangle {
    public static void main(String[] args) {
        int number = 1;
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(number + " ");
                number = number + 1;
            }
            System.out.println();
        }
    }
}
