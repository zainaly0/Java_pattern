package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int min;
        int temp = 0;
        int[] arr = { 38, 52, 9, 18, 6, 62, 13 };

        for (int a = 0; a < arr.length; a++) {
            min = a;
            for (int b = a + 1; b < arr.length; b++) {
                if (arr[min] > arr[b]) {  //searching value
                    min = b;
                }
            }

            temp = arr[a];
            arr[a] = arr[min];
            arr[min] = temp;

        }

        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
