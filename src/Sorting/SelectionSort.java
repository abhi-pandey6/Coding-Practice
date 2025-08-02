package Sorting;

public class SelectionSort {
    public static void SelectionSort(int[]arr){

        for (int i = 0; i < arr.length-1; i++) {
            int min_value = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[min_value]) {
                    min_value = j; //j ka value min dabba me denge
                }

            }
            int temp = arr[i];
              arr[i] = arr[min_value];
             arr[min_value] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {7,5,4,1,3};
        SelectionSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
