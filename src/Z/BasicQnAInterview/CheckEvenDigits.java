package Z.BasicQnAInterview;
import java.util.Scanner;
public class CheckEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean allEven = true;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                allEven = false;
                break;
            }

            n = n / 10;
        }

        if (allEven) {
            System.out.println("All digits are even");
        } else {
            System.out.println("All digits are not even");
        }

        sc.close();
    }
}


