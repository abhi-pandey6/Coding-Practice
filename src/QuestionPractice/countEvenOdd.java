package QuestionPractice;
import java.util.Scanner;
public class countEvenOdd {

    public static void count(int[] arr) {
        int countOdd = 0;
        int countEven = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;

            }
        }
        System.out.println("Total even elements: " + countEven);
        System.out.println("Total odd elements: " + countOdd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            }
        count(arr);

        }
    }
