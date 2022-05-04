package Problems;

public class FirstSetBit {
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

        // Your code here
        return 0;
    }
}
