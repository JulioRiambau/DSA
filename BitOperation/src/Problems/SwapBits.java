package Problems;

public class SwapBits {
    public static int swapBits(int n)
    {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 32; i++){
            if (i%2 == 0){
                even = even | (1<<i);
            }
            else {
                odd = odd | (1<<i);
            }
        }

        int odds = n&odd;
        int evens = n&even;
        odds = odds >>1;
        evens = evens <<1;

        return evens|odds;
    }
}
