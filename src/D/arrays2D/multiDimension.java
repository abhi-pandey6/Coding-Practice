package D.arrays2D;
public class multiDimension {
    public static void print2Darray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }
    }
    public static void main(String[] args) {
        int [][] arr2D ={ {1,2,3},{4,5,6},{7,8,9}} ;
        print2Darray(arr2D);
    }
}
