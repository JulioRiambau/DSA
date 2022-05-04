package Problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparseTest {

    @Test
    void isSparse_1() {
        boolean result = Sparse.isSparse(2);
        assertEquals(true, result);
    }

    @Test
    void isSparse_2() {
        boolean result = Sparse.isSparse(3);
        assertEquals(false, result);
    }

    @Test
    void isSparse_3() {
        boolean result = Sparse.isSparse(5);
        assertEquals(true, result);
    }

    @Test
    void isSparse_4() {
        boolean result = Sparse.isSparse(12);
        assertEquals(false, result);
    }
}