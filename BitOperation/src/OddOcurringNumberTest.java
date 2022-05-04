import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOcurringNumberTest {

    @Test
    void find_1() {
        Integer[] arr = {4,3,4,4,4,5,5};
        int result = OddOcurringNumber.find_efficient(arr);
        Assert.assertEquals(3, result);
    }

    @Test
    void find_2() {
        Integer[] arr = {8,7,7,8,8};
        int result = OddOcurringNumber.find_efficient(arr);
        Assert.assertEquals(8, result);
    }

    @Test
    void find_missing_1() {
        Integer[] arr = {1,4,3};
        int result = OddOcurringNumber.find_missing(arr);
        Assert.assertEquals(2, result);
    }

    @Test
    void find_missing_2() {
        Integer[] arr = {1,5,3,2};
        int result = OddOcurringNumber.find_missing(arr);
        Assert.assertEquals(4, result);
    }
}