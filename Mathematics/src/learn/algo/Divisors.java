package learn.algo;

public class Divisors {

    public static String PrintDivisors(int n){
        String result = "";
        for (int i = 1; i<=n; i++){
            if (n%i == 0){
                result += i+",";
            }
        }

        return result;
    }

    public static String PrintDivisors1(int n){
        String result_low = "";
        String result_high= "";
        for (int i = 1; i*i<=n; i++){
            if (n%i == 0){
                result_low += i+",";
                if(i*i != n){
                    result_high = n/i+","+result_high;
                }

            }
        }

        return result_low+result_high;
    }
}
