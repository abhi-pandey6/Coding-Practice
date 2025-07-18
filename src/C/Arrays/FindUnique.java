package C.Arrays;
import java.util.Scanner;
public class FindUnique {

    public static int findUniqueElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                ans = arr[i];
            }

        }
    return ans;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Size of array: ");
        int n = sc.nextInt(); // input size

        int [] arr = new int[n];
        System.out.println("Enter the elements: ");// input element
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The unique element is: "+findUniqueElement(arr));
    }
}
