package C.Arrays;

import java.util.Scanner;

public class SumOfElements {

    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();  // size of array
        int[] arr = new int[n];

        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Input array elements
        }


        int sum = 0;

        for (int i = 0; i < n ; i++) {
            sum = sum + arr[i];
            //i++;

        }

        System.out.println(sum);
    }
}
