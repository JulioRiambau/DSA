import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurringNumbersTest {

    @Test
    void find_1() {
        Integer[] arr = {3,4,3,4,5,4,4,6,7,7};
        ArrayList<Integer> result = OddOccurringNumbers.find_2(arr);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);
        Assert.assertEquals(expected, result);
    }

    @Test
    void find_2() {
        Integer[] arr = {20,15,20,16};
        ArrayList<Integer> result = OddOccurringNumbers.find_2(arr);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(15);
        expected.add(16);
        Collections.sort(result);
        Assert.assertEquals(expected, result);
    }
}