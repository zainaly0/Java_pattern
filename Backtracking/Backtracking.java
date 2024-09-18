// package Backtracking;

public class Backtracking {

    public static void printPermutation(String str, String perm, int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);
            // System.out.println(currChar);
            // System.err.println(i + " a: "+str.substring(0, i));
            // System.out.println(i + " b: " +str.substring(i+1));
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, perm+ currChar, idx+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);

    }
}
