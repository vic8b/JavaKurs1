package Homework.Homework_9;

public class PasswordValidator {
    private PasswordValidator() {}

    public static void validate(String pwd) throws IllegalArgumentException {
        if (pwd == null) {
            throw new IllegalArgumentException("password cannot be null");
        }

        if (pwd.length() < 8) {
            throw new IllegalArgumentException("password has less than 8 characters");
        }

        validateIfPasswordHasDigits(pwd);

        System.out.println("Password is ok");
    }

    private static void validateIfPasswordHasDigits(String pwd) {
        boolean hasNumbers = false;
        char[] charArray = pwd.toCharArray();

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                hasNumbers = true;
            }
        }

        if (!hasNumbers) {
            throw new IllegalArgumentException("password has no digits");
        }
    }
}
