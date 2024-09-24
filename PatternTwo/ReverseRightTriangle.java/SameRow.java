public class SameRow {
    public static void main(String[] args){
        int row = 5;
        int col = 5;
        for(int a  =1; a<=row; a++){
            for(int b = row-a; b>=0; b--){
                System.out.print(a);
            }
            System.out.println();
            
        }
    }    
}
