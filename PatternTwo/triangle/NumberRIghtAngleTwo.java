package PatternTwo.triangle;

public class NumberRIghtAngleTwo {
    public static void main(String[] args) {
        int n = 5;
        for(int row= 0; row<2*n; row++){
            int colms = row>n?2 * n-row:row;
            for(int col = 1; col<colms; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
