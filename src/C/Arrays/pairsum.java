// kitne ese pair number hai jise add krne par targer element ke equal aata hai
package C.Arrays;

import java.util.Scanner;

public class pairsum {
    public static int pairSum(int[] arr,int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt(); // input of array element

        }
        System.out.println("Enter the number to : ");
        int target = sc.nextInt(); // take input for x

        int result = pairSum(arr,target);
        System.out.println("Number of pairs with sum " + target + " is: " +result);

    }
}


