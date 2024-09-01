package Sorting;

public class BubbleSortTwo {
    public static void main(String[] args) {
        int[] arr=  {7, 8, 3, 1, 2};

        // FIRST WAY
        // for(int a = 0; a<arr.length; a++){
        //     int temp;
        //     for(int b = a+1; b<arr.length; b++){
        //         if(arr[a] > arr[b]){
        //             temp = arr[a];
        //             arr[a] = arr[b];
        //             arr[b] = temp;
        //         }
        //     }
        // }

        // SECOND WAY
        for(int a = 0; a<arr.length-1; a++){
            int temp;
            for(int b =0; b<arr.length-1-a; b++){
                if(arr[b] > arr[b+1]){
                    temp = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = temp;
                }
            }
        }

        for(int a = 0; a<arr.length; a++){
            System.out.println(arr[a]);
        }
    }
}
