package Problems;

public class sumOFallOdd {
    public static void SumOfodds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("THe Sum of odd numbers from 1 to 10 is: " +sum);
    }

    public static void main(String[] args) {
        int n = 10;
       SumOfodds(n);


    }

}