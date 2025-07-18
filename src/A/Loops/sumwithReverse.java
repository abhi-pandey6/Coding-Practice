package A.Loops;
import java.util.Scanner;
public class sumwithReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n!=0){
            int lastdigit = n%10;
            rev = rev*10+lastdigit;
            n/=10;

        }
        System.out.println(original+rev);

    }
}
