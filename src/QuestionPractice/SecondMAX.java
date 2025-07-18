package QuestionPractice;

import java.util.Scanner;

public class SecondMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for ( int i = 0; i < n; i++) {
            if (max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Tha maximum element in the array is: "+max);

        int Secondmax = 0;
        for ( int i = 0; i < n; i++) {
            if (Secondmax < arr[i] && arr[i] != max){
                Secondmax=arr[i];
            }
        }
        System.out.println("Tha Second maximum element in the array is: "+Secondmax);


    }

}
