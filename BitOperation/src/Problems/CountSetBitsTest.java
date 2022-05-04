package Problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSetBitsTest {

    @Test
    void countSetBits_1() {
        int result = CountSetBits.countSetBits(4);
        Assert.assertEquals(5, result);
    }

    @Test
    void countSetBits_2() {
        int result = CountSetBits.countSetBits(17);
        Assert.assertEquals(35, result);
    }

    @Test
    void countSetBits_3() {
        int result = CountSetBits.countSetBits(8);
        Assert.assertEquals(13, result);
    }

    @Test
    void countSetBits_4() {
        int result = CountSetBits.countSetBits(1000000);
        Assert.assertEquals(9884999, result);
    }

}