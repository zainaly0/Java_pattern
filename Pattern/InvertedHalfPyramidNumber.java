package Pattern;

public class InvertedHalfPyramidNumber {
    public static void main(String[] args) {
        for(int a = 5; a>=1; a--){
            for(int b = 1; b<=a; b++){
                System.out.print(b+ " ");
            }
            System.out.println();
        }
    }
}
