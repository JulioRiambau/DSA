package Problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrayConverterTest {

    @Test
    void greyConverter_1() {
        int result = GrayConverter.greyConverter(7);
        assertEquals(4, result);
    }

    @Test
    void greyConverter_2() {
        int result = GrayConverter.greyConverter(10);
        assertEquals(15, result);
    }

    @Test
    void greyConverter_3() {
        int result = GrayConverter.greyConverter(0);
        assertEquals(0, result);
    }

    @Test
    void greyConverter_4() {
        int result = GrayConverter.grayToBinary(4);
        assertEquals(7, result);
    }

    @Test
    void greyConverter_5() {
        int result = GrayConverter.grayToBinary(15);
        assertEquals(10, result);
    }

    @Test
    void greyConverter_6() {
        int result = GrayConverter.grayToBinary(0);
        assertEquals(0, result);
    }
}