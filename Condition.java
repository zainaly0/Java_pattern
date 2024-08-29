import java.util.*;

class Condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age > 18) {
        // System.out.println("aduls");
        // } else {
        // System.out.println("not adult");
        // }

        // System.out.print("enter the number: ");
        // int x = sc.nextInt();
        // if(x%2 ==0){
        // System.out.println("even");
        // }else{
        // System.out.println("odd");
        // }

        // System.out.print("enter the number of a: ");
        // int a = sc.nextInt();
        // System.out.print("enter the number of b: ");
        // int b = sc.nextInt();
        // if (a == b) {
        // System.out.println("equal");
        // } else if (a > b) {
        // System.out.println("a is greatest");
        // } else {
        // System.out.println("b is greatest");
        // }

        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("salaam");
                break;
            case 3:
                System.out.println("bojunga");
                break;
            default:
                System.out.println("wrong answere baby");
        }
    }
}