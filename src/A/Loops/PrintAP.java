package A.Loops;
import java.util.Scanner;
public class PrintAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System .in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 3, d = 4;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a+=d;
        }

    }
}
