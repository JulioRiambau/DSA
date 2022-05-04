package Quiz;

public class MaxSumSpan {
    public static int Find(int[] A, int[] B){
        int maxLen = 0;

        for(int i = 0; i< A.length; i++){
            int sum_a = 0;
            int sum_b = 0;
            int len = 0;
            for(int j = i; j < A.length; j++){
                sum_a += A[j];
                sum_b += B[j];

                if (sum_a == sum_b){
                    len = j - i + 1;
                    if (len > maxLen){
                        maxLen = len;
                    }
                }
            }
        }

        return maxLen;
    }
}
