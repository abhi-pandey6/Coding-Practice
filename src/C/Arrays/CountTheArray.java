//Count the given number of element in given array greater than a given number X.
package C.Arrays;
import java.util.Scanner;
public class CountTheArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]>x) count++;
        }
        System.out.print("Number of element greater than " + x + " is = "  +count);

    }
}
