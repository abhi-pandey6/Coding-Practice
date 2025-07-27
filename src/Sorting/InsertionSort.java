package Sorting;

public class InsertionSort {

        public static void insertionSort(int[] arr) {

            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];  // jis element ko insert karna hai
                int j = i - 1;

                // pichle elements ko shift karna jab tak wo key se bade ho
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                // sahi position pe key ko rakhna
                arr[j + 1] = key;
            }
        }

        public static void main(String[] args) {
            int[] arr = {9, 8, 7, 4, 5, 6, 3, 2, 1};
            insertionSort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


