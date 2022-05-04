package Problems;

public class ConsecutiveOnes {

    public static int maxConsecutiveOnes(int n) {

        int temp = 0;
        int count = 0;
        while (n > 0){
            int lastBit = n&1;
            if (lastBit == 1){
                temp++;
                if (temp > count){
                    count = temp;
                }
            }
            else{
                temp = 0;
            }

            n = n >> 1;
        }

        return count;

    }

}
