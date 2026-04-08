package Homework.Homework_2;

class Task13 {
    private static final String LOGIN = "test";
    private static final String PASSWORD = "Abc123";
    private static final int LOGINS_TO_LOCK = 3;
    static int loginTries = 0;

    static void mainLoop() {
        userInputLogin();
        printLoginStatus(loginTries);
    }

    private static void userInputLogin() {
        while (loginTries < LOGINS_TO_LOCK) {
            System.out.println("Podaj login: ");
            String userLogin = Input.sc.nextLine();

            System.out.println("Podaj hasło: ");
            String userPassword = Input.sc.nextLine();

            if (!userLogin.equals(LOGIN) || !userPassword.equals(PASSWORD)) {
                System.err.println("Błędne dane logowania");
                loginTries++;
            } else {
                break;
            }
        }
    }

    private static void printLoginStatus(int loginTries) {
        if (loginTries == LOGINS_TO_LOCK) {
            System.err.println("Konto zablokowane");
        } else {
            System.out.println("Zalogowano");
        }
    }
}
