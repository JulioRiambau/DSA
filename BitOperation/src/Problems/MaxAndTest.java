package Problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAndTest {

    @Test
    void totalMaxAnd_1() {
        int[] arr = {4,8,12,16};
        int result = MaxAnd.maxAND(arr, 4);
        Assert.assertEquals(8, result);
    }

    @Test
    void totalMaxAnd_2() {
        int[] arr = {4,8,16,2};
        int result = MaxAnd.maxAND(arr, 4);
        Assert.assertEquals(0, result);
    }

    @Test
    void totalMaxAnd_3() {
        int[] arr = {18, 17, 16, 15, 14, 13, 12};
        int result = MaxAnd.maxAND(arr, 7);
        Assert.assertEquals(16, result);
    }

    @Test
    void totalMaxAnd_4() {
        int[] arr = {18, 15, 13, 12, 12, 11};
        int result = MaxAnd.maxAND(arr, 6);
        Assert.assertEquals(13, result);
    }

}