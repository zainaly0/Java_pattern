// package ReverseRightTriangle.java;

public class StarReverse {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for(int a=0; a<n; a++){
            for(int b = n-a; b>0; b--){
                System.out.print(" * ");
            }
            System.err.println("   ");
        }
    }
}
