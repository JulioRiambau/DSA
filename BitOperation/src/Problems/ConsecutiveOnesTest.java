package Problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveOnesTest {

    @Test
    void maxConsecutiveOnes_1() {
        int result = ConsecutiveOnes.maxConsecutiveOnes(14);
        assertEquals(3, result);
    }

    @Test
    void maxConsecutiveOnes_2() {
        int result = ConsecutiveOnes.maxConsecutiveOnes(222);
        assertEquals(4, result);
    }

    @Test
    void maxConsecutiveOnes_3() {
        int result = ConsecutiveOnes.maxConsecutiveOnes(258);
        assertEquals(1, result);
    }
}