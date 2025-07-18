package C.Arrays;
import java.util.Scanner;
public class SOPofEachPair {

    // Method to calculate sum of all pair
         public static void sumOfAllPair(int[] arr){
             long sum = 0;
             long sumSq = 0;

             for (int i = 0; i < arr.length; i++) {
                 sum += arr[i];
                 sumSq += (long) arr[i] * arr[i]; // To avoid overflow
             }

             long result = (sum * sum - sumSq) / 2;

             System.out.println("Sum of product of all pairs: " + result);

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
            sumOfAllPair(arr);


        }
    }


