package SquarePattern;

public class SameRow {
    public static void main(String[] args){
        int row = 5;
        int col = 5;
        for(int a = 0; a<row; a++){
            for(int b = 0; b<col; b++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
