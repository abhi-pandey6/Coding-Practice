package QuestionsPractice;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] arg){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count == 1) {
            System.out.println("The N is a Prime number");
            }
            else {
                System.out.println("The N is Not a Prime number");

            }

        }
    }

