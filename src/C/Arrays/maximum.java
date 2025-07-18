package C.Arrays;
import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();  // size of array

        int[] arr = new int[n];

        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Input array elements
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }


        int smax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > smax && arr[i]!= max)
                smax = arr[i];
        }
        System.out.println("The Second maximum Element is: " + (smax));
        System.out.print("The maximum Element is: " + (max));
    }
}


