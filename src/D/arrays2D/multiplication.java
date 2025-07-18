package D.arrays2D;
import java.util.Scanner;
public class multiplication {

    // Function to print a 2D array
    public static void print2Darray(int[][] arr) {
        for (int[] row : arr) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    // Function to multiply two matrices
    static void multiplyMatrix(int[][] mat1, int r1, int c1, int[][] mat2, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible - Invalid dimensions.");
            return;
        }

        int[][] product = new int[r1][c2];

        // Matrix multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Product of matrix 1 and matrix 2:");
        print2Darray(product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix 1
        System.out.print("Enter rows and columns of matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        System.out.println("Enter elements of matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input matrix 2
        System.out.print("Enter rows and columns of matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];
        System.out.println("Enter elements of matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Display matrices
        System.out.println("Matrix 1:");
        print2Darray(mat1);
        System.out.println("Matrix 2:");
        print2Darray(mat2);

        // Multiply matrices
        multiplyMatrix(mat1, r1, c1, mat2, r2, c2);
    }
}
