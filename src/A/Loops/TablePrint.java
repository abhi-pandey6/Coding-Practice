package A.Loops;
import java.util.Scanner;
public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(n*i);
          }
        }
    }

