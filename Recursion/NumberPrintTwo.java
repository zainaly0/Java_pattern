package Recursion;

public class NumberPrintTwo {
    public static void printNum(int num){
        if(num == 6){
            return;
        }
        System.out.println(num);
        printNum(++num);
        
    }

    public static void main(String[] args){
        printNum(1);
    }
    
}
