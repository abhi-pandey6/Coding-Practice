package Problems;
import java.util.Scanner;
public class avgprint {
    public static int avg(int a, int b, int c) {
        int avg = ((a + b + c) / 3);
        System.out.println(avg);
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextByte();
        int b = sc.nextByte();
        int c = sc.nextByte();
         avg(a,b,c);



    }
}
