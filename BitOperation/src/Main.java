public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.println("Bit Operations");
        //System.out.println(is_bit(1,1));
//        System.out.println(is_bit(8,2));
//
//        System.out.println(count_set_bit_3(5));
//        System.out.println(count_set_bit_3(8));
//        System.out.println(count_set_bit_3(13));

        PowerSet.FindSet2("abc");

    }

    public static boolean is_bit(int n, int k){
        int result = n&(1 << (k-1));
        return result!=0;
    }

    public static int count_set_bit_1(int n){
        int count = 0;
        while (n>0){
            count = count + (n&1);
            n = n>>1;
        }
        return count;
    }

    public static int count_set_bit_2(int n){
        int count = 0;
        while (n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }


    public static int count_set_bit_3(int n){
        int count = 0;
        int[] table = new int[256];
        table[0] = 0;

        for (int i = 1; i < 256; i++){
            table[i] = (i&1) + table[i/2];
        }

        count = table[n&(0xff)];
        n = n>>8;

        count = count + table[n&(0xff)];
        n = n>>8;

        count = count + table[n&(0xff)];
        n = n>>8;

        count = count + table[n&(0xff)];

        return count;
    }
}
