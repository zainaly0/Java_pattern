package RightTriangle;

public class NumberTrianglePattern {
    public static void main(String[] args){
        int n = 5;
        int m = 5;
        int num = 1;
        for(int a = 1; a<=n; a++){
            for(int b = 1; b<=a; b++){
                // num = num+(b-a);
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
