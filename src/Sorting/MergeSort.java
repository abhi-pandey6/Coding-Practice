package Sorting;

public class MergeSort {


        // Function to divide the array and call merge
        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;

                // Divide
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);

                // Conquer
                merge(arr, left, mid, right);
            }
        }

        // Function to merge two sorted halves
        public static void merge(int[] arr, int left, int mid, int right) {
            int[] temp = new int[right - left + 1];
            int i = left, j = mid + 1, k = 0;

            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            while (j <= right) {
                temp[k++] = arr[j++];
            }

            // Copy temp array back to original arr
            for (int t = 0; t < temp.length; t++) {
                arr[left + t] = temp[t];
            }
        }


    // Main to test the algorithm
        public static void main(String[] args) {
            int[] arr = {5, 2, 9, 1, 6, 3};
            mergeSort(arr, 0, arr.length - 1);

            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

