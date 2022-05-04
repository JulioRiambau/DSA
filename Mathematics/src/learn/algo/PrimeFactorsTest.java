package learn.algo;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PrimeFactorsTest {

    @Test
    void testIsPrime2() {

        assertEquals("3357", CheckPrime.PrimeFactors2(315));
    }

    @Test
    void testIsPrime3() {

        assertEquals("23355", CheckPrime.PrimeFactors2(450));
    }

    @Test
    void testSieve() {

        boolean[] primes = CheckPrime.Sieve(10);
        String result ="";
        for (int i = 0; i<primes.length; i++)
            if (primes[i])
                result=result+i+",";
        assertEquals("2,3,5,7,", result);
    }

    @Test
    void testSieve1() {

        boolean[] primes = CheckPrime.Sieve(30);
        String result ="";
        for (int i = 0; i<primes.length; i++)
            if (primes[i])
                result=result+i+",";
        assertEquals("2,3,5,7,11,13,17,19,23,29,", result);
    }

}
