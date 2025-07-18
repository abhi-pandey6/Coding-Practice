package C.Arrays;
import java.util.Scanner;
public class SearchXInArray {

   public static void SearchxElement(int[] arr,int n,int x) {

       for (int i = 0; i < n; i++) {
           if (arr[i] == x) {
               System.out.println("Element is present in index" + i);

           }

           }
       System.out.println("Element is not present" );


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
        System.out.println("Enter the number to search: ");
        int x = sc.nextInt(); // take input for x

        SearchxElement(arr,n,x);


    }
}
