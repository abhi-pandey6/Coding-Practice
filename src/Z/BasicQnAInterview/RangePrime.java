package Z.BasicQnAInterview;

import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        for (int num = a; num <= b; num++) {

            if(num<=1){
                continue;
            }
            boolean isprime = true;

            for (int i = 2; i <= num/2; i++) {
                if(num%i==0){
                    isprime = false;
                    break;
                }
            }
                if(isprime){
                    System.out.print(num +" ");
                }

            }


        }
    }

