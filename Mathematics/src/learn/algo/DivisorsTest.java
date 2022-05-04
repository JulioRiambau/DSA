package learn.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

class DivisorsTest {

    @Test
    void printDivisors_1() {
        assertEquals("1,3,5,15,", Divisors.PrintDivisors1(15));
    }

    @Test
    void printDivisors_2() {
        assertEquals("1,2,4,5,10,20,25,50,100,", Divisors.PrintDivisors1(100));
    }
}