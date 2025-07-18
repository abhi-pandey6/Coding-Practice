package D.arrays2D;
import java.util.Scanner;

public class Rotate90Matrix {

    // Function to print input matrix
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    // Function to Transpose two matrices
    static void TransposeMatrix(int[][] matrix, int r, int c) {
        // Matrix transpose logic
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

        static void reverseArraysRows(int[] arr){
            int i = 0, j = arr.length-1;

            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }

    static void rotate(int[][] matrix,int n) {
            //step 1 - transpose
            TransposeMatrix(matrix,n,n);

        //step 2 - reverse each row
        for (int i = 0; i < n; i++) {
       reverseArraysRows(matrix[i]);
        }
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input matrix
            System.out.print("Enter rows and columns of matrix: ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];
            System.out.println("Enter elements of matrix: ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Display matrices
            System.out.println("Original Matrix: ");
            printMatrix(matrix);

            rotate(matrix, r);

            // call for transpose
            System.out.println("90 degree matrix: ");
            printMatrix(matrix);
    }
}

