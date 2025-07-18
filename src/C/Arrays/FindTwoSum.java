// Find the doublet in the array whose sum is equal to the given value x.
package C.Arrays;

import java.util.Scanner;

public class FindTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[i] + arr[j] == x){
                    System.out.println("Doublet found: " + arr[i] + " + " + arr[j] + " = " + x);
                    break;
                }
            }
        }
    }
}







