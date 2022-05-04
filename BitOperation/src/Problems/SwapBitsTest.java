package Problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapBitsTest {

    @Test
    void swapBits_1() {
        int result = SwapBits.swapBits(23);
        assertEquals(43, result);
    }

    @Test
    void swapBits_2() {
        int result = SwapBits.swapBits(2);
        assertEquals(1, result);
    }
}