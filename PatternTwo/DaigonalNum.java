public class DaigonalNum{
    public static void main(String[] args){
        int n = 5;
        int m = 5;
        for(int a = 1; a<=n; a++){
            for(int b = 1; b<=m; b++){
                if(a==b){
                    System.out.print(a + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}