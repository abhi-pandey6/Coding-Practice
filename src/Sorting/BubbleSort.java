package Sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            boolean swapped = false; // "no swap has happened yet".

            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr [j+1] = temp;
                    swapped = true; // ✅ Swap happened
                }
            }
            if (!swapped) {
                // ❌ No swaps means array is sorted
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr ={8,4,5,2,3,1,};
        bubbleSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
