package RightTriangle;

public class StringIncrement {
    public static void main(String[] args){
        int n=5;
        int m = 5;
        String str = "ABCDEFGHIJKLMNOPQURSTUVXYZ";
        int num = 0;
        for(int a = 0; a<n; a++){
            for(int b = 0; b<=a; b++){
                char ch = str.charAt(num);
                System.out.print(ch + " ");
                num++;
            }
            System.out.println();
        }
    }
}
