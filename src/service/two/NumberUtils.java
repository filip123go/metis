package service.two;

public class NumberUtils {

    public static int sumDigits(int number) {
        while (number >= 10) {
            number = String.valueOf(number)
                    .chars()
                    .map(Character::getNumericValue)
                    .sum();
        }
        return number;
    }
}
