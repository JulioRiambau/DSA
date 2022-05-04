package Problems;

public class Sparse {

    public static boolean isSparse(int n)
    {
        int test = 0;
        while (n > 0){
            int lastBit = n&1;
            if (lastBit == 1 && test == 1){
                return false;
            }

            test = lastBit;
            n = n >> 1;
        }
        return true;
    }

}
