package Z.BasicQnAInterview;

import java.util.Scanner;

public class FibonacciUptoNtimes {
    public static void main(String[] args) {
        int x;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter how many times you want to print: ");
        x = obj.nextInt();

        int a = 0, b=1;

        System.out.print("Fibonacci series is: ");
        for (int i = 0; i < x; i++) {
            System.out.print(a+ " ");
            int c = a+b;
             a = b;
             b = c;

        }

    }
}
