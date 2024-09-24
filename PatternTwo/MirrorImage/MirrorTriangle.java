package PatternTwo.MirrorImage;

public class MirrorTriangle {
    public static void main(String[] args){
        int row = 5;
        int col  = 5;
        for(int a = 0; a<row; a++){
            for(int b = row-a; b>0; b--){
                System.out.print("  ");
            }

            for(int b = 0; b<=a; b++){
                System.out.print("  *  ");
            }
            System.out.println();
        }
    }
}
