package Recursion;

/***
public class FibonacciSequence {
    public static void main(String[] args) {
        fibSeq(100);
    }

    public static void fibSeq(int num){
        if(num){
            return 0;
        }
        int numberTree = 
        int numberOne = 0;
        int numberTwo = 1;
        

        return fibSeq(numberOne+numberTwo);

    }
    
}
 */



 public class FibonacciSequence{
    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b + "\n");
        int n = 7;
        printFib(a, b, n-2);
    }
 }