package Problems;

import java.util.Scanner;

public class fibonacciSeries {
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <=n ; i++) {
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        fibonacci(n);



    }
}
