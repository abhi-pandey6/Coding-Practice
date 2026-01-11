package Z.BasicQnAInterview;

import java.util.Scanner;

public class reverseNum {
    public static void main (String[]args){

        int n, reverse;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(n>0){

            reverse = n%10;
            System.out.print(reverse);
            n = n/10;
        }

    }
}
