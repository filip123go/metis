package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import service.two.NumberUtils;

public class NumberUtilsTest {

    @Test
    public void testSumDigits10() {
        assertEquals(1, NumberUtils.sumDigits(10));
    }

    @Test
    public void testSumDigits38() {
        assertEquals(2, NumberUtils.sumDigits(38));
    }

    @Test
    public void testSumDigits785() {
        assertEquals(2, NumberUtils.sumDigits(785));
    }

    @Test
    public void testSumDigits99892() {
        assertEquals(1, NumberUtils.sumDigits(99892));
    }
}