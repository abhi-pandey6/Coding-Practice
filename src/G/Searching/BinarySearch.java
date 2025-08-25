package G.Searching;

import java.lang.reflect.GenericDeclaration;

public class BinarySearch {

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else{
                    start = mid - 1;
            }
            }


    return -1;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int target = 509;
        int ans = BinarySearch(arr,target);

        if (ans == -1) {
            System.out.println("element is not found in the array ");
        }
        else{
            System.out.println("element found in the array");


        }
    }
}
