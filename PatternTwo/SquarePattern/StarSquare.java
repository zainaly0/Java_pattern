package SquarePattern;
public class StarSquare {
    public static void main(String[] args){
        int n = 5;
        int m = 5;
        for(int a = 1; a<=n; a++){
            for(int b = 0; b<=m; b++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
