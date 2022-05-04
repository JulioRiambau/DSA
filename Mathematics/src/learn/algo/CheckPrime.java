package learn.algo;

import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;

public class CheckPrime {
    public static boolean IsPrime(int n){
        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i*i <= n; i=i+5){
            if(n % i == 0 || n % (i+2) == 0){
                return false;
            }
        }

        return true;
    }

    public static String PrimeFactors1(int n){
        if (n == 1)
            return "";

        String result = "";

        for(int i = 2; i*i <= n; i++ ){
            if (IsPrime(i) && n%i == 0){
                int temp = i;
                while (n%temp == 0){
                    result+=i;
                    temp = temp*i;
                }
            }
        }

        return result;
    }

    public static String PrimeFactors2(int n){
        if (n == 1)
            return "";

        String result = "";

        while (n%2==0){
            result+=2;
            n = n/2;
        }

        while (n%3==0){
            result+=3;
            n = n/3;
        }

        for(int i = 5; i*i <= n; i=i+6 ){
            if (n%i == 0){
                while (n%i == 0){
                    result+=i;
                    n = n/i;
                }
            }

            if (n%(i+2) == 0){
                while (n%(i+2) == 0){
                    result+=i+2;
                    n = n/(i+2);
                }
            }
        }

        if ( n > 3)
            result+=n;

        return result;
    }

    public static boolean[]  Sieve(int n){
        boolean[] isPrime = new boolean[n];
        for (int i = 0; i<n; i++)
            isPrime[i] = true;

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i*i<=n; i++)
            if(isPrime[i]){
                for (int j = i*i; j<n; j = j+i)
                    isPrime[j] = false;
            }

        return isPrime;
    }
}
