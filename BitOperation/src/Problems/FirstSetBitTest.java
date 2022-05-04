package Problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstSetBitTest {

    @Test
    void getFirstSetBit_1() {
        int result = FirstSetBit.getFirstSetBit(18);
        Assert.assertEquals(2, result);
    }

    @Test
    void getFirstSetBit_2() {
        int result = FirstSetBit.getFirstSetBit(0);
        Assert.assertEquals(0, result);
    }

    @Test
    void getFirstSetBit_3() {
        int result = FirstSetBit.getFirstSetBit(3);
        Assert.assertEquals(1, result);
    }

    @Test
    void getFirstSetBit_4() {
        int result = FirstSetBit.getFirstSetBit(4);
        Assert.assertEquals(3, result);
    }
}