package QuestionsPractice;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
