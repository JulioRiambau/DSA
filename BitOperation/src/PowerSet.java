public class PowerSet {

    public static void FindSet(String s){
        double size = Math.pow(2, s.length());
        for (int i = 0; i< size; i++){
            String set = "";
            int temp = i;
            int bit = 0;
            while (temp > 0){
                int result = i& (1 << (bit));
                if (result > 0){
                    set += s.charAt(bit);
                }
                bit++;
                temp = temp>>1;
            }
            System.out.println(i + " : " +set);
        }
    }

    public static void FindSet2(String s){
        double size = Math.pow(2, s.length());
        for (int i = 0; i< size; i++){
            String set = "";
            for (int j = 0; j < s.length(); j++){
                if ( (i&(1<<j)) != 0){
                    set += s.charAt(j);
                }
            }
            System.out.println(i + " : " +set);
        }
    }


    public static boolean is_bit(int n, int k){
        int result = n&(1 << (k-1));
        return result!=0;
    }
}
