package C.Arrays;

public class PrintFloatSum {
    public static void main(String[] args) {
          float [] arr = {7.5f,3.3f,5.6f,4.5f,3.7f};
          float sum = 0;
          float n = arr.length;

          for (int  i = 0; i<n ; i++){
              sum = sum + arr[i];

          }
        System.out.println(sum);

    }
}
