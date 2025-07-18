package Problems;

import java.util.Scanner;
public class eligibleForVote {
    public static void age(int n) {

        if (n >= 18) {
            System.out.println("you are eligible for vote");
        } else {
            System.out.println("Not eligible for vote");

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int n = sc.nextInt();

        age(n);

    }
}




