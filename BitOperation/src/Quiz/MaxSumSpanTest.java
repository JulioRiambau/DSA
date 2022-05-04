package Quiz;

import Problems.Power2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumSpanTest {

    @Test
    void find_1() {
        int[] A = {0,1,0,0,0,0};
        int[] B = {1,0,1,0,0,1};

        int result = MaxSumSpan.Find(A, B);
        assertEquals(4, result);
    }

    @Test
    void find_2() {
        int[] A = {0,1,0,1,1,1,1};
        int[] B = {1,1,1,1,1,0,1};

        int result = MaxSumSpan.Find(A, B);
        assertEquals(6, result);
    }

    @Test
    void find_3() {
        int[] A = {0,0,0};
        int[] B = {1,1,1};

        int result = MaxSumSpan.Find(A, B);
        assertEquals(0, result);
    }
}