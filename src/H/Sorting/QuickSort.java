package H.Sorting;

public class QuickSort {
    static void quicksort(int[] arr,int low, int high){
        if(low<high){
            int pivortIDX = partition(arr,low,high);

            quicksort(arr,low,pivortIDX-1);
            quicksort(arr,pivortIDX+1,high);
        }
    }

    static int partition(int[] arr,int low, int high){
        int pivort = arr[high];
        int i = low -1;
        for (int j = low; j <high ; j++) {
            if(arr[j]< pivort){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }


        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;


    }
    public static void main(String[] args) {
        int [] arr = {5,8,9,3,7};
        quicksort(arr,0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
