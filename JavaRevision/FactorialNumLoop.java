package JavaRevision;

public class FactorialNumLoop {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        for (int a = 1; a <= n; a++) {
            sum = sum * a;
        }

        System.out.println(sum);
    }
}
