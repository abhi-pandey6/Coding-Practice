package E.Strings;
import java.util.Scanner;

public class duplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        System.out.print("Duplicate characters are:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // If character occurs more than once and it hasn't been printed yet:
            if (count > 1 && str.indexOf(ch) == i) {
                System.out.print(ch);
            }
        }
    }
}
