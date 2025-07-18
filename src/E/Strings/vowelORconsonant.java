package E.Strings;

import java.util.Scanner;

public class vowelORconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int vowelCount = 0;
        int  consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); // convert to lower case

            // check if it is an alphabet
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

            System.out.println("Vowel = " + vowelCount);
            System.out.println("Consonant = " + consonantCount);
        }
    }

