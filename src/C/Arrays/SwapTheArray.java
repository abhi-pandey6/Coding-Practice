//Swap the array
package C.Arrays;

public class SwapTheArray {

    public static void printSwap(int[] arr) {
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        printSwap(arr);
        for (int i = 0; i < n/2; i++) {
            int j = n - 1 - i;
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }

        printSwap(arr);

    }
}



//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int n = arr.length;
//        for (int i = 0; i < n / 2; i++) {
//            int j = n - 1 - i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//            for (int i=0; i<n; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//}
//
