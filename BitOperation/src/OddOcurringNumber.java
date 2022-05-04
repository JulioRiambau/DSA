import java.util.HashMap;
import java.util.Map;

public class OddOcurringNumber {

    public static int find(Integer[] n){
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


        for (Map.Entry<Integer, Integer> set : freq.entrySet()){
            if (set.getValue() % 2 != 0){
                return set.getKey();
            }
        }

        return -1;
    }


    public static int find_efficient(Integer[] n){
        int result = 0;
        for (int i : n) {
            result = result ^ i;
        }

        return result;
    }

    public static int find_missing(Integer[] n){
        int result = 0;
        for (int i : n) {
            result = result ^ i;
        }

        for (int i = 1; i <= n.length+1; i++){
            result = result ^ i;
        }

        return result;
    }
}
