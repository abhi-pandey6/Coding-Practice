package QuestionPractice;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={2,4,6,8,10};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n/2; i++) {
            int j = n - 1 - i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i <n; i ++){
            System.out.print(arr[i]+" ");
        }

    }
}
