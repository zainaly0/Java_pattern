package Sorting;

public class SelectionSortTwo {
    public static void main(String[] args) {
        // selection and bubble has only one difference that is
        // bubble inner loop is decreasing from last whereas in selection sort is
        // increasing from start so that we can say that both are almost same

        // TIME COMPLEXITY = O(n^2)
        int[] arr = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            // smallest element index store
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
