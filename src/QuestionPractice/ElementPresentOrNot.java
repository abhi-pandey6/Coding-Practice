package QuestionPractice;
import java.util.*;
public class ElementPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("Enter Searching element x: ");
            int x = sc.nextInt();


            for ( int i = 0; i < n; i++) {
                if (x == arr[i]) {
                    System.out.println("Element is present:");
                    return;
                }
            }
            System.out.println("element is not present");

        }

    }

