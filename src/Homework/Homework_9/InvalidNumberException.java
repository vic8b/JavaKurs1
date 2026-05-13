package Homework.Homework_9;

public class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

final class NumberParser {
    static int parsePositiveInt(String s) {
        try {
            int stringToInt = Integer.parseInt(s);

            if (stringToInt > 0) {
                return stringToInt;
            } else {
                throw new IllegalArgumentException("non-positive: " + stringToInt);
            }
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid number: '<" + s + ">'", e);
        }
    }
}
