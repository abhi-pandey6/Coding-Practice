package B.Methods;

public class BasicMethods {
    public static void pehla(){
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
    }
    public static void tisra(){
        dusra();
    }
    public static void dusra (){
        System.out.println("Abhi pandey");
    }

    public static void main(String[] args) {
        pehla();
        dusra();
        tisra();
    }
}
