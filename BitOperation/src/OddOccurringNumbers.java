import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddOccurringNumbers {

    public static ArrayList<Integer> find(Integer[] n){
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i: n) {
            Integer count = freq.get(i);
            if (count == null) {
                freq.put(i, 1);
            }
            else {
                freq.put(i, count + 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> set : freq.entrySet()){
            if (set.getValue() % 2 != 0){
                result.add(set.getKey());
            }
        }

        return result;
    }


    public static ArrayList<Integer> find_2(Integer[] n){

        int result = find_efficient(new ArrayList<Integer>(List.of(n)));
        int res1 = 0;
        int res2 = 0;
        int k = result & ~(result-1);

        for (int i :n) {
            if ((i & k) != 0){
                res1 = res1^i;
            }
            else {
                res2 = res2^i;
            }
        }

        ArrayList<Integer> result_items = new ArrayList<>();
        result_items.add(res1);
        result_items.add(res2);
        return result_items;
    }

    public static int find_efficient(ArrayList<Integer> n){
        int result = 0;
        for (int i : n) {
            result = result ^ i;
        }

        return result;
    }

    public static boolean is_bit(int n, int k){
        int result = n&(1 << (k-1));
        return result!=0;
    }
}
