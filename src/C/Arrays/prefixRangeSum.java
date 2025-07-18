package C.Arrays;
import java.util.Scanner;

public class prefixRangeSum {
        static int[] makeprefixSumArray(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i] + arr[i - 1];
            }
            return arr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n+1];

            System.out.print("Enter the Elements: ");
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt(); // input of array element
            }
            int[] prefix = makeprefixSumArray(arr);

//            System.out.print("Enter queries: ");
//            int q = sc.nextInt();
//
//            while (q-->0){
                System.out.print("Enter starting index (l): ");
                int l = sc.nextInt();
                System.out.print("Enter ending index (r): ");
                int r = sc.nextInt();

                int ans = prefix[r] - prefix[l-1];
                System.out.println("Sum "+ans);
            }

        }

    //}


