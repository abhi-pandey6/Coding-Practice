// prefix sum with extra array
package C.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class PrefixSum1 {
    static int[] makeprefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n]; // create extra array
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // input of array element
        }
        int [] pref = makeprefixSumArray(arr);
        System.out.println("prefix array is : " +Arrays.toString(pref));

    }

}



