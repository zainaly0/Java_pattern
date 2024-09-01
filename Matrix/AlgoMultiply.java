import java.util.Scanner;

class AlgoMultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define 3x3 matrices
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3]; // Resultant matrix

        // Input elements for matrix A
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = input.nextInt();
            }
        }

        // Input elements for matrix B
        System.out.println("\nEnter the elements of matrix B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = input.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < 3; i++) { // Loop over rows of A
            for (int j = 0; j < 3; j++) { // Loop over columns of B
                C[i][j] = 0; // Initialize the element at position (i,j)
                for (int k = 0; k < 3; k++) { // Loop over rows of B and columns of A
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
 
        // Print the resulting matrix C
        System.out.println("\nResultant Matrix C (A x B):");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
