package Problems;

public class MaxAnd {
    public static int maxAND (int arr[], int N) {

        int totalAnd = 0;
        for (int i = 31; i >= 0; i--){
            int count = 0;
            int test = 1 << i;
            int pattern = totalAnd|test;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & pattern) == pattern){
                    count++;
                }
            }

            if (count >= 2){
                totalAnd = totalAnd | test;
            }
        }

        return totalAnd;
    }
}
