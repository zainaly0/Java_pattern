package Sorting;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 3, 2 };

        for (int a = 0; a < arr.length - 1; a++) {
            int flag = 0;
            // System.out.println("top outer flag " + flag+ " a: " + a);
            for (int b = 0; b < arr.length - 1 - a; b++) {
                if (arr[b] > arr[b + 1]) {
                    // Swap arr[b] and arr[b + 1]
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                    flag = 1;
                    // System.out.println(" inner flag " + flag+ " b: " + b + " a: " + a);
                }
            }
            // System.out.println("bottom outer flag " + flag+ " a: " + a);

            // If no two elements were swapped in the inner loop, the array is sorted
            if (flag == 0) {
                break;
            }
        }

        // Print sorted array
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
