package Z.BasicQnAInterview;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not Prime");
            return;

        }

        boolean isPrime = true;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
