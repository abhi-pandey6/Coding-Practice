package A.Loops;
import java.util.Scanner;
public class ReverseUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            int lastdigit = n%10;
            rev = rev * 10 +lastdigit;
            n/=10;
        }
        System.out.println(rev);

    }
}
