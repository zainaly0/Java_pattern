package Recursion;

public class PowerCalculationFun {
    public static int calcPower(int x, int n) {
        if (n == 1) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPowernum = calcPower(x, n - 1);
        System.out.println("xPowernum "+ xPowernum + " _ "+ n);
        int xPowern = x * xPowernum;
        System.out.println(xPowern+ " xPowern");
        return xPowern;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
