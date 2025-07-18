// prefixSum without extra array.
package C.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class prefixSum2 {
    static int[] makeprefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i]  + arr[i-1];
        }
        return arr;
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
        int [] ans = makeprefixSumArray(arr);
        System.out.println("prefix array is : " + Arrays.toString(ans));

    }

}




