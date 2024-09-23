package SquarePattern;
public class X_DaigonalALPHA {
    public static void main(String[] args){
        int n = 5;
        int m = 5;
        String str = "ABCDE";
        for(int a = 1; a<=n; a++){
            for(int b = 1; b<=m; b++){
                if(a == b || a+b == 6){
                    char ch= str.charAt(b-1);
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
