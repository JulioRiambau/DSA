public class MaxAnd {

    public static int checkBit(int pattern, int[] arr){
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if ((pattern & arr[i]) == pattern){
                count++;
            }
        }

        return count;
    }


    public static int TotalMaxAnd(int[] arr ){
        int res = 0;
        int count;

        for (int i = 6; i >= 0; i--){
            count = checkBit(res|(1<<i), arr);

            if (count >= 2){
                res = res | (1 << i);
            }
        }

        return res;
    }
}
