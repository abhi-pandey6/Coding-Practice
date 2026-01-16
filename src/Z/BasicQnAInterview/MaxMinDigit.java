package Z.BasicQnAInterview;

import java.util.Scanner;

public class MaxMinDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int min = 9, max = 0, r;

        while (n > 0) {
            r = n % 10;

            if (r < min) min = r;
            if (r > max) max = r;

            n = n/10;

        }
        System.out.println("max = "+ max + " Min = "+ min);


    }
}
