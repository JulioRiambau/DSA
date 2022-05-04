import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MaxAndTest {

    @Test
    void totalMaxAnd() {
        int[] arr = {4,8,12,16,14};
        int result = MaxAnd.TotalMaxAnd(arr);
        Assert.assertEquals(12, result);
    }
}