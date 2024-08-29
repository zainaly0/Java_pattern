import java.util.*;

class Loops{
    public static void main(String args[]){
        // for(int a = 0; a <= 10; a = a+1){
        //     System.out.println(a);
        // }


        // int a = 0;
        // while(a<10){
        //     System.out.println(a + ": mullah");
        //     a++;
        // }


        // int b = 0;
        // do{
        //     System.out.println("hello mullah ");
        //     b++;
        // }while(b<10);


        // SUM OF N NATURAL NUMBER S
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter n number");
        // int number = sc.nextInt();
        // int sum= 0;
        // for(int a = 0; a<=number; a++){
        //     sum += a;

        // }
        // System.out.println(sum);
        int tableNum = sc.nextInt();
        for(int a = 1; a<10; a++){
            System.out.println(tableNum* a);
        }
    }

}