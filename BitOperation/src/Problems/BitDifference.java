package Problems;

public class BitDifference {
    public static int countBitsFlip(int a, int b){
        int xor = a^b;

        return count_set_bit(xor);

    }

    public static int count_set_bit(int n){
        int count = 0;
        while (n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
