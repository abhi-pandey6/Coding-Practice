package Z.BasicQnAInterview;

import java.util.Scanner;

public class OddEven {
    public static void main(String[]args){
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value ");
        a=obj.nextInt();

        if(a%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
