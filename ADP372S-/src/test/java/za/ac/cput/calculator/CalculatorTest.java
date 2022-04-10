package za.ac.cput.calculator;

/*      CalculatorTest.java
        Entity for CalculatorTest
        Author: Mugammad Tashreeq Emeran (214137805)
        Date: 10 April 2022

 */
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void Identity() {
        Calculator calculator = new Calculator();
        assertSame(5, calculator.add(1, 4), "1 + 4 should equal 5");
    }
    void Equality() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    void testFail() {
        fail("Failed Test");
    }

    @Test
    void Timeout() {
        assertTimeout(ofMillis(9), () -> Thread.sleep(10));
    }

    @Ignore
    @Test
    public void testDisable() {
        Calculator calculator = new Calculator();
        assertSame(5, calculator.add(1, 4), "1 + 4 should equal 5");
    }
}


