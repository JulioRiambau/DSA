package learn.algo;

import java.util.ArrayList;

public class Problems {
    public static int absolute(int I) {
        if(I >= 0 ){
            return I;
        }

        return -1*I;
    }


    public static double cToF(int C)
    {
        double temp = C;
        return temp*9/5+ 32;
    }

    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {

        double D = b*b - 4.0*a*c;
        ArrayList<Integer> roots = new ArrayList<>();
        if (D<0){
            roots.add(-1);
        }
        else{
            double r1 = (-b + Math.sqrt(D))/(2.0*a);
            double r2 = (-b - Math.sqrt(D))/(2.0*a);

            if (r1 > r2){
                roots.add((int)Math.floor(r1));
                roots.add((int)Math.floor(r2));
            }
            else{
                roots.add((int)Math.floor(r2));
                roots.add((int)Math.floor(r1));
            }

        }

        return roots;
    }

    public static long factorial(int N) {
        long result = 1;
        for (int i = 1; i <= N; i++)
            result = result*i;

        return result;
    }

    public static int digitsInFactorial(int N){
        double factorial = 1;
        for (double i = 1; i <= N; i++)
            factorial = factorial*i;

        int digits = 0;
        while (factorial > 0){
            digits++;
            factorial = Math.floor(factorial/10);
        }

        return digits;
    }

    public static int digitsInFactorial1(int N){
        double factorial = 0;
        for (double i = 1; i <= N; i++)
            factorial = factorial + Math.log10(i);

        return (int) Math.floor(factorial) +1;
    }

    public static double termOfGP(int A,int B,int N)
    {
        double r = B/(A*1.0);

        return  A*Math.pow(r, N-1);
    }

    public static boolean isPrime(int N) {
        if (N == 1)
            return false;
        if (N == 2 || N == 3)
            return true;
        if (N%2 == 0 || N%3 == 0)
            return false;

        for (int i = 5; i*i <= N; i = i + 6)
        {
            if (N%i == 0 || N%(i+2) == 0 )
                return false;
        }

        return true;

    }

    public static int exactly3Divisors(int N)
    {
        int count3Divisors = 0;

        for (int i = 1; i<=N; i++){
            if (i*i > N){
                break;
            }

            if (isPrime(i)){
                count3Divisors++;
            }


        }

        return count3Divisors;
    }

    public static long sumUnderModulo(long a, long b){
        long M = 7 + (long)Math.pow(10,9);
        return ((a%M) + (b%M))%M;
    }

    static long multiplicationUnderModulo(long a, long b)
    {
        long M = 7 + (long)Math.pow(10,9);
        return ((a%M) * (b%M))%M;
    }

    public static int modInverse(int a, int m)
    {
        if (gcd(a, m) == 1){
            for (int i = 0; i< m; i++){
                if ((a*i)%m == 1){
                    return i;
                }
            }
        }
        return -1;//Your code here
    }

    public static int gcd(int a, int b){
        if (b == 0)
            return a;

        return gcd(b, a%b);
    }
}
