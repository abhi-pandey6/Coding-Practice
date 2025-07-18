// print the roll number of students

package C.Arrays;
import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Student: ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.print("Enter the Marks of Students: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
               if(arr[i]<35){
                   System.out.println("The Roll number of student is " + i);
               }



        }
    }
}
