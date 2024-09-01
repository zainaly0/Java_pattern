package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 6, 2, 4, 3 };
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;

            }
            arr[j] = temp;
        }

        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
