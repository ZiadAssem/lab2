import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class minMaxSearchTest {
    int x[]={3,4,1,6,3,6,-9};
    @Test
    void findMin() {
        assertEquals(-9,minMaxSearch.findMin(x));
    }

    @Test
    void findMax() {
        assertEquals(6,minMaxSearch.findMax(x));
    }
}