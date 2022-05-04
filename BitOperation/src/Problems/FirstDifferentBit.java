package Problems;

public class FirstDifferentBit {

    public static int posOfRightMostDiffBit(int m, int n)
    {
        if (m == n){
            return -1;
        }
        int xor = m^n;
        return getFirstSetBit(xor);
    }

    public static int getFirstSetBit(int n){
        int k = 1;
        int test = 1;
        while (test <= n){
            int result = n&test;
            if(result != 0){
                return k;
            }
            k++;
            test = (1<<k-1);
        }

        return 0;
    }
}
