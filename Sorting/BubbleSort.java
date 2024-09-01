package Sorting;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 2};

        for(int a = 0; a<arr.length; a++){
            for(int b = 0; b<arr.length-1-a; b++){
                if(arr[b] >arr[b+1]){
                    int temp = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = temp;
                }
            }
        }

        for(int a=0; a<arr.length; a++){
            System.out.println(arr[a]);
        }
    }

}