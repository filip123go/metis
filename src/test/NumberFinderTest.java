package test;

import org.junit.jupiter.api.Test;
import service.one.NumberFinder;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberFinderTest {
    @Test
    public void testFindNumberFound() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals("Found", NumberFinder.findNumber(numbers, 3));
    }

    @Test
    public void testFindNumberNotFound() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals("there is no number 7 in the array", NumberFinder.findNumber(numbers, 7));
    }
}