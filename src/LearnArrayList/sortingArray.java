package LearnArrayList;

import java.util.ArrayList;
import java.util.*;


public class sortingArray {




        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> l1 = new ArrayList<>();
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            for (int i=0; i<n; i++){
                int element = sc.nextInt();
                l1.add(element);
            }
            System.out.println("original array"+l1);

            Collections.sort(l1);
            System.out.println("sorted array"+l1);



        }

    }



