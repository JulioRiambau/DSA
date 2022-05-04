package learn.algo;


import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

class CheckPrimeTest {
    @Test
    void testIsPrime1() {
        assertEquals(true, CheckPrime.IsPrime(5));
    }

    @Test
    void testIsPrime2() {
        assertEquals(false, CheckPrime.IsPrime(6));
    }

    @Test
    void testIsPrime3() {
        assertEquals(true, CheckPrime.IsPrime(101));
    }

    @Test
    void testIsPrime4() {
        assertEquals(false, CheckPrime.IsPrime(200));
    }
}