// Print 2nd highest factor of n
package A.Loops;
import java.util.Scanner;
public class highestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number: ");
        int n = sc.nextInt();
        int hf = 1;
        for (int i = n-1; i > 1; i--) {
            if (n % i == 0) {
                hf = i;
                break;

            }
        }
        System.out.println("The 2nd highest factor is " +hf);
    }

}

