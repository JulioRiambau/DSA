package learn.algo;

public class PowerCalculation {
    public static int Power(int x, int n){

        int result = 1;
        for (int i = 0; i < n; i++){
            result = result * x;
        }

        return result;
    }

    public static int Power1(int x, int n){

        if(n == 0)
            return 1;

        int temp = Power1(x, n/2);
        temp = temp * temp;
        if (n%2 == 0)
            return  temp;
        else
            return temp*x;
    }

    public static int Power2(int x, int n){
        int result = 1;

        while (n>0){
            if (n%2!=0){
                result = result * x;
            }

            n = n/2;
            x = x*x;
        }

        return result;
    }
}
