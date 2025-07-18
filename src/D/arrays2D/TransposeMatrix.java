package D.arrays2D;
import java.util.Scanner;


public class TransposeMatrix {

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
        static int[][] TransposeMatrix(int[][] matrix, int r, int c) {

            int[][] ans = new int[c][r];

            // Matrix transpose logic
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    ans[i][j] = matrix[j][i];

                    }
                }
            return ans;
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
            System.out.println("Matrix: ");
            printMatrix(matrix);

            // call for transpose
            System.out.println("Transpose of matrix: ");
            int [][] ans = TransposeMatrix(matrix,r,c);
            printMatrix(ans);
        }
    }


