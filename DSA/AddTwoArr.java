public class AddTwoArr {

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] B = {
                { 7, 8, 9 },
                { 4, 5, 6 },
                { 1, 2, 3 }
        };
        int[][] C = new int[3][3];
        for (int a = 0; a < A.length; a++) {
            for (int b = 0; b < B.length; b++) {
                C[a][b] = A[a][b] + B[a][b];
            }
        }

        for (int a = 0; a < A.length; a++) {
            for (int b = 0; b < A[0].length; b++) {
               System.out.print(C[a][b] + " ");
            }
            System.out.println();
        }
    }
}
