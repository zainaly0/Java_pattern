package SquarePattern;

public class CharPrint {
    
    public static void main(String[] args){
        char ch = 'A';
        for(int a  =0; a<5; a++){
            for(int b = 0; b<5; b++){
                System.out.print(ch);
                ch = (char) (ch+1);
            }
            System.out.println();
        }
    }
}
