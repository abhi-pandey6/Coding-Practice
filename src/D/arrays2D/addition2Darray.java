package D.arrays2D;
import java.util.Scanner;
public class addition2Darray {

    public static void print2Darray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

     static void add(int[][]arr, int r1, int c1, int[][]arr2, int r2, int c2) {
         if (r1 != r2 || c1 != c2) {
             System.out.println("Wrong input - addition not possible");
             return;
         }
         int[][] sum = new int[r1][c1];
         for (int i = 0; i < r1; i++) {
             for (int j = 0; j < c1; j++) {
                 sum[i][j] = arr[i][j] + arr2[i][j];
             }
         }
         System.out.println("Sum of matrix 1 and matrix 2");
         print2Darray(sum);
     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row and columns of matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        System.out.print("Enter matrix value: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number of rows and columns 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.print("Enter matrix value: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }

        }
        System.out.println("matrix 1");
        print2Darray(arr);
        System.out.println("matrix 2");
        print2Darray(arr2);
        add(arr,r1,c1,arr2,r2,c2);
    }
}



