package Backtracking;

public class Suduko {

    public boolean helper(char[][] board, int row, int col) {
        if(row == board.length){
            
        }

        int nrow = 0;
        int ncol = 0;
        
        if(col != board.length-1){
            nrow = row; 
            ncol = col+1;
        }else{
            nrow = row +1;
            ncol = 0;
        }

        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;
            }else{
                for(int i = 1; i<=9; i++){
                    if(isSafe(board, row, col)){
                        board[row][col] = (char) (i+ "0");
                        if(helper(board, nrow, ncol)){
                            return true;
                        }else{
                            board[row][col] = '.';
                        }
                    }
                }
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void main(String[] args) {

    }
}
