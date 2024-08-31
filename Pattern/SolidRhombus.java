package Pattern;

class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int a = 1; a<=n; a++){
           for(int b =1; b<=(n-a+1); b++){
               System.out.print("  ");
           }

           for(int b =1; b<=n; b++){
            System.out.print("* ");
           }
            System.out.println();
        }
    }
}

