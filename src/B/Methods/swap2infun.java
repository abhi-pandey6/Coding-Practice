package B.Methods;
public class swap2infun {
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The swap value is: "+ a+" " +b);
    }

    public static void main(String[] args) {
        int  a = 5;
        int b = 10;
        swap(a,b);

    }
}
