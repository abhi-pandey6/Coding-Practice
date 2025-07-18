package C.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();  // size of array

        int[] arr = new int[n];

        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Input array elements
        }

        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();  // Number to search


        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print("The number is present in the array.");
                return;

            }
        }

        System.out.print("The number is not present in the array.");
    }
}