package Homework.FirstHomework;

class Task10 {
    private static final int MIN_PASSWORD_LENGTH = 8;

    static void mainLoop() {
        System.out.println("Podaj hasło: ");
        String userPassword = Input.sc.nextLine();

        checkPassword(userPassword);
    }

    private static void checkPassword(String userPassword) {
        if (checkPasswordLength(userPassword)) {
            checkIfFirstCharIsUpperCase(userPassword);
        }
    }

    private static void checkIfFirstCharIsUpperCase(String userPassword) {
        if (Character.isUpperCase(userPassword.charAt(0))) {
            System.out.println("OK");
        } else {
            System.err.println("Hasło musi zaczynać sie wielką literą");
        }
    }

    private static boolean checkPasswordLength(String userPassword) {
        boolean isCorrect = true;
        if (userPassword.length() < MIN_PASSWORD_LENGTH) {
            System.err.println("Hasło za krótkie (minimum " + MIN_PASSWORD_LENGTH + " znaków)");
            isCorrect = false;
        }
        return isCorrect;
    }
}
