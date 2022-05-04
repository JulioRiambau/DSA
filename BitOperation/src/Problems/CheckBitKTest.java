package Problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckBitKTest {

    @Test
    void checkKthBit_1() {
        boolean result = CheckBitK.checkKthBit(4, 0);
        Assert.assertEquals(false, result);
    }

    @Test
    void checkKthBit_2() {
        boolean result = CheckBitK.checkKthBit(4, 2);
        Assert.assertEquals(true, result);
    }

    @Test
    void checkKthBit_3() {
        boolean result = CheckBitK.checkKthBit(500, 3 );
        Assert.assertEquals(false, result);
    }
}