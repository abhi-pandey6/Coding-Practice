package QuestionPractice;
import java.util.Scanner;
public class uniqueElement {

    public static void uniquenumber(int[]arr){

        for (int i=0; i<arr.length;i++){
            int count = 0;
            for(int j=0; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println("unique element is: "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        uniquenumber(arr);
    }
}
