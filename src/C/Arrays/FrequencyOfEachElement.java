package C.Arrays;
import java.util.Map;
import java.util.HashMap;

public class FrequencyOfEachElement {

    public static void main(String[]srgs){
        int[] arr = {1,4,5,5,9,6,3,9,4};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length ; i++) {

            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }

        }
        for(Map.Entry entry:hm.entrySet()){

            System.out.println("Element | Frequency");
            System.out.println(entry.getKey()+"               "+entry.getValue());
        }

    }
}
