package learn.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

class PowerCalculationTest {

    @Test
    void power1() {
        assertEquals(8, PowerCalculation.Power2(2,3));
    }

    @Test
    void power2() {
        assertEquals(1024, PowerCalculation.Power2(2,10));
    }
}