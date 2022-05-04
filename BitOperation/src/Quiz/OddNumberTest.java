package Quiz;

import Problems.SwapBits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberTest {

    @Test
    void fun() {
        int arr[] = {9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2};
        int result = OddNumber.fun(arr, 13);
        assertEquals(9, result);
    }
}