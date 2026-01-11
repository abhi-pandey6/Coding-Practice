package Z.BasicQnAInterview;

import java.util.Scanner;

public class POSnegZERO {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        a = obj.nextInt();

        if(a>0){
            System.out.println("positive");
        } else if (a<0) {
            System.out.println("negative");

        }
        else{
            System.out.println("Zero");
        }
    }
}
