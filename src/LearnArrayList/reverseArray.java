package LearnArrayList;
import java.util.*;


public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            ArrayList<Integer> l1 = new ArrayList<>();
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            int element = sc.nextInt();
            l1.add(element);
        }
        System.out.println(l1);

        Collections.reverse(l1);
        System.out.println(l1);



        }

    }

