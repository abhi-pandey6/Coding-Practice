package Z.BasicQnAInterview;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int Even_Count = 0;
        int Odd_Count = 0;

        while(n>0){
             int remender = n%10;
             if(n%2==0){
                 Even_Count++;
             }
             else{
                 Odd_Count++;
             }
             n = n/10;
        }
        System.out.println("Even number = "+Even_Count+ " ," +"Odd number = "+ Odd_Count);
    }
}
