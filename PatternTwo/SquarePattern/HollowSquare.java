package SquarePattern;
public class HollowSquare {
    public static void main(String[] args){
        int n = 5;
        int m = 5;
        for(int a = 1; a<=n; a++){
            for(int b = 1; b<=m; b++){
                if(a == 1 || a==n || b== 1 || b==m){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
