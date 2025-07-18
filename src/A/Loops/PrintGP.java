package A.Loops;
import java.util.Scanner;
public class PrintGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number ");
          int n = sc.nextInt();
          // 3 7 11 15.... upto n terms
          int a = 1, r = 2;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a+" ");
            a *= r;

        }
        }
    }

