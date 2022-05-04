package Problems;

public class GrayConverter {

    public static int greyConverter(int n) {

        return n ^ (n >> 1);

    }

    public static int grayToBinary(int n) {

        int mask = n;
        while (mask > 0) {
            mask >>= 1;
            n   ^= mask;
        }

        return n;

    }
}
