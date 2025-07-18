package E.Strings;
import java.util.Scanner;
public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char front = str.charAt(i);
            int back = str.charAt(n-1-i);

            if(front == back){
                System.out.println("String is Palindrom");
                return;

            }

        }
        System.out.println("String is not palindrom");


    }
}

