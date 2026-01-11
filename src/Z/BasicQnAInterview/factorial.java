package Z.BasicQnAInterview;



import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int x;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number ");
        x = obj.nextInt();

        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial of this number is "+fact);


    }


}
