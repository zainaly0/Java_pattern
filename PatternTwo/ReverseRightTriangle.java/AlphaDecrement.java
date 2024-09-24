public class AlphaDecrement {
    public static void main(String[] args){
        int row = 5;
        int col = 5;
        char ch = 'E';
        for(int a = 0; a<row; a++){
            for(int b = 5-a; b>0; b--){
                System.out.print(ch);
                ch--;
            }
            ch = (char)(ch-1);
            System.out.println();
        }
    }
}
