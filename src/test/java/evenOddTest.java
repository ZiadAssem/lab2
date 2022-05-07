import static org.junit.jupiter.api.Assertions.*;

class evenOddTest {

    @org.junit.jupiter.api.Test
    void tworeturnEven() { assertEquals("Even",evenOdd.check(2));
    }
    @org.junit.jupiter.api.Test
    void negTworeturnEven() { assertEquals("Even",evenOdd.check(-2));
    }
    @org.junit.jupiter.api.Test
    void threereturnOdd() { assertEquals("Odd",evenOdd.check(3));
    }
    @org.junit.jupiter.api.Test
    void negThreereturnOdd() { assertEquals("Odd",evenOdd.check(-3));
    }
    @org.junit.jupiter.api.Test
    void zeroreturnEven() { assertEquals("Even",evenOdd.check(0));
    }
}