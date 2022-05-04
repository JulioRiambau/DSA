package Problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Power2Test {

    @Test
    void isPowerofTwo_1() {
        boolean result = Power2.isPowerofTwo(4);
        assertEquals(true, result);
    }

    @Test
    void isPowerofTwo_2() {
        boolean result = Power2.isPowerofTwo(1);
        assertEquals(true, result);
    }

    @Test
    void isPowerofTwo_3() {
        boolean result = Power2.isPowerofTwo(98);
        assertEquals(false, result);
    }
}