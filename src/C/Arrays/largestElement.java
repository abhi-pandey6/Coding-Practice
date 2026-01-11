package C.Arrays;

public class largestElement {
    public static void main(String[]args){
        int [] arr = {10,8,9,6,4,7,55,42,23};

        int max = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("Largest Element is: "+max);
    }
}
