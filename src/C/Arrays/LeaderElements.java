package C.Arrays;

import java.util.Scanner;

public class LeaderElements {

    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int max_from_right = arr[n - 1];

        int[] leaders = new int[n];  // Temporary array to store leaders
        int index = 0;

        leaders[index++] = max_from_right; // Last element is always leader

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max_from_right) {
                max_from_right = arr[i];
                leaders[index++] = max_from_right;
            }
        }

        // Now print leaders in reverse order (to correct them)
        System.out.print("Leader elements: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findLeaders(arr);
    }
}
