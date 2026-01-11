package Z.BasicQnAInterview;

import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 1) {
            System.out.println("Nth Fibonacci number: " + a);
        }
        else if (n == 2) {
            System.out.println("Nth Fibonacci number: " + b);
        }
        else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Nth Fibonacci number: " + c);
        }
    }
}
