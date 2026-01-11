package Z.BasicQnAInterview;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main (String[]args){

        int n,r,c,arm=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        c=n;

        while(n>0){

            r = n%10;
           arm = (r*r*r)+arm;
           n = n/10;
        }
        if(c==arm){
            System.out.print("Armstrong Number");
        }
        else{
            System.out.print("Not Armstrong Number");
        }

    }
}


