package Problems;

public class Power2 {
    public static boolean isPowerofTwo(long n){
        int test = 1;
        while (test <= n){
            if ((test & n) == n){
                return true;
            }

            test = test << 1;
        }

        return false;

    }
}
