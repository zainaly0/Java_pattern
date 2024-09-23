public class StringSquarePrint {
    public static void main(String[] args){
        int n = 5;
        int m = 5;
        String str = "ABCDE";
        for(int a = 0; a<n; a++){
            for(int b = 0; b<m; b++){
                char ch = str.charAt(b);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
