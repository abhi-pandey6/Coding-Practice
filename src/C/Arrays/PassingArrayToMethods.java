package C.Arrays;

public class PassingArrayToMethods {
    public static void change(int [] arr){
        arr[2]=99;

    }
    public static void main(String[] args) {
       int [] arr = {12,45,69,48};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
}
