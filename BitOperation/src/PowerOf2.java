public class PowerOf2 {
    public static boolean is_power_2_div(int n){
        if (n == 0)
            return false;

        while (n>1){
            if (n%2 != 0){
                return false;
            }
            n = n / 2;
        }

        return true;
    }

    public static boolean is_power_2_shift(int n){
        if (n == 0)
            return false;

        int power = 1;
        while (power <= n){
            if (power == n){
                return true;
            }
            power = (power << 1);
        }

        return false;
    }

    public static boolean is_power_2_brian(int n){
        if (n == 0)
            return false;

        int test_set_bit = n & (n-1);
        return test_set_bit == 0;
    }

    public static int count_set_bit_2(int n){
        int count = 0;
        while (n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

}
