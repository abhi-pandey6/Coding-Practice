package H.Sorting;

public class InsertionSort {

        public static void insertionSort(int[] arr) {

            for (int i = 1; i < arr.length; i++) {
                int j = i;
                while(j>0 && arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {9, 8, 7, 5, 3, 2, 1};
            insertionSort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


