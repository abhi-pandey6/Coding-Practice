package E.Strings;
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your String");
        StringBuilder str = new StringBuilder("Pandey");

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
             int back = n - i - 1;

            char frontChar = str.charAt(i);
            char backChar = str.charAt(back);

            str.setCharAt(i, backChar);
            str.setCharAt(back, frontChar);
        }
            System.out.println("Reverse string is: "+str);
    }
}
