package service.one;

import java.util.List;

public class NumberFinder {
    public static String findNumber(List<Integer> numbers, int lookup) {
        if (numbers.stream().anyMatch(n -> n == lookup)) {
            return "Found";
        } else {
            return "there is no number " + lookup + " in the array";
        }
    }
}