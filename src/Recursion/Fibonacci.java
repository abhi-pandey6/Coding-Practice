package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}



//package Recursion;
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        int ans = fibo(7);
//        System.out.println("Final Answer: " + ans);
//    }
//
//    static int fibo(int n) {
//        System.out.println("Calling fibo(" + n + ")");
//
//        if (n < 2) {
//            System.out.println("Returning " + n + " from fibo(" + n + ")");
//            return n;
//        }
//
//        int left = fibo(n - 1); // fibo(1)
//        int right = fibo(n - 2); // fibo(0)
//
//        int result = left + right;
//        System.out.println("Returning " + result + " from fibo(" + n + ")");
//        return result;
//    }
//}
