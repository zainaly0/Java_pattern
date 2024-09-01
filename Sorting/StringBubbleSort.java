package Sorting;

public class StringBubbleSort {
    public static void main(String[] args){
        String[] name = {"aly", "mullah", "zain", "syed", "mujahid"};

        for(int a= 0; a<name.length; a++){
            String temp = "";
            for(int b = 0; b<name.length-1; b++){
                if(name[b].compareTo(name[b+1]) >0){
                    temp = name[b];
                    name[b] = name[b+1];
                    name[b+1] =  temp; 

                    System.out.println("string value: " + name[b].compareTo(name[b+1]) + "");
                }
            }
        }

        for(int a= 0; a<name.length; a++){
            System.out.println(name[a]);
        }

    }
}
