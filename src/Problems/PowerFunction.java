package Problems;

import java.util.Scanner;

public class PowerFunction {
    public static int power(int x,int n){
        int result = 1;
        for (int i = 1; i <=n; i++) {
            result *= x;

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int result = power(x,n);
        System.out.println(result);




    }
}
