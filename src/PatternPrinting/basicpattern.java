package PatternPrinting;
import java.util.Scanner;
public class basicpattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number");
        int x = sc.nextInt();
        System.out.println("Enter the coulam number");
        int y = sc.nextInt();
        for (int i = 1; i <=x; i++) {
            for (int j = 1; j <=x; j++) {
                System.out.print("* ");
            }
            System.out.println();



        }


    }
}
