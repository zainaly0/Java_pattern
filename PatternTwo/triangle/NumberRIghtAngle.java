package PatternTwo.triangle;

public class NumberRIghtAngle {
    public static void main(String[] args){
        int row = 5;
        int col = 5;
        for(int a = 1; a<=row; a++){
            for(int b = 1; b<=a; b++){
                System.out.print(b);
            }
            System.out.println();
        }
    }

}
