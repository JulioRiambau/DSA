package Problems;

public class CountSetBits {


    public static int countSetBits(int n){

        if(n == 1){
            return 1;
        }

        if ((n & (n-1)) == 0){
            return 1 + countSetBits(n - 1);
        }

        int count = 0;

        int x = 0;
        while (n > Math.pow(2, x)){
            x++;
        }

        x--;

        int setBits = (int)Math.pow(2, x) * x / 2;

        count += setBits;

        count += n - (int)Math.pow(2, x) + 1;

        int subproblem = n & ~(1<<x);

        return count + countSetBits(subproblem);

    }
}
