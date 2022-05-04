package Problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitDifferenceTest {
    @Test
    void countBitsFlip_1() {
        int result = BitDifference.countBitsFlip(10, 20);
        assertEquals(4, result);
    }

    @Test
    void countBitsFlip_2() {
        int result = BitDifference.countBitsFlip(20, 25);
        assertEquals(3, result);
    }
}