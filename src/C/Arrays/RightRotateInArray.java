package C.Arrays;
import java.util.Scanner;
public class RightRotateInArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // array ka size
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            //  input for array elements
            System.out.print("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // 👤 kitna position rotation karna hai uska value (k)
            System.out.print("Enter how many positions to right rotate: ");
            int k = sc.nextInt();
            k = k % n;

            // ek ans name ka arr banayenge or j ko 0 me rakhenge ,
            int[] ans = new int[n];
            int j = 0;

            // last k element ko copy krenge front ke taraf, arr[i] ka value j me denge,
            for (int i = n-k; i < n; i++) {
                ans[j++] = arr[i];
            }

            // baki jo value bach gya usko v j me denge
            for (int i = 0; i < n - k; i++) {
                ans[j++] = arr[i];
            }

            // Print kr denge  array ko
            System.out.print("Right Rotated Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }

        }
    }

