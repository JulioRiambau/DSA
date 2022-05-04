package Problems;

public class CheckBitK {

    static boolean checkKthBit(int n, int k)
    {
        int test = 1 << k;

        return (test & n) != 0;
    }
}
