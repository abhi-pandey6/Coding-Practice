package LearnArrayList;
import java.util.ArrayList;
public class BasicAL {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println(l1); // for print all element
        System.out.println(l1.get(2)); // for print specific index

        l1.add(1,15); //add element in a specific element
        System.out.println(l1);

        l1.set(0,5);
        l1.set(1,10); // modify element at index i
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1); // remove index

        System.out.println(l1.remove(Integer.valueOf(40))); // remove specific element
        System.out.println(l1);

        //add any type of data structure.
        ArrayList l = new ArrayList();
        l.add("Abhiii");
        l.add(1);
        System.out.println(l);
    }
}
