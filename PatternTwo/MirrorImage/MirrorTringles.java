package PatternTwo.MirrorImage;

public class MirrorTringles {
    public static void main(String[] args) {
       int row = 5;
       int col = 9;
       for(int a  = 1; a<=row; a++){
            for (int b = row-a; b >0 ; b--) {
                System.out.print(" ");
            }

            for(int b = 1; b<=a+2; b+=2){
                System.out.print(" *");
            }
            System.out.println();
       }
    }
}
