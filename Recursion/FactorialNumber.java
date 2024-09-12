package Recursion;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(facNum(5));
    }

    public static int facNum(int num){
        System.out.println("num: " + num);
        if(num == 0 || num == 1){
            return 1;
        }
        int zaid=  num * facNum(num -1);
        System.out.println("number: " + num);
        System.out.println(zaid);
        return zaid;
    }
}
