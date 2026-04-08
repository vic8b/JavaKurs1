package Homework.Homework_2;

class Task7 {
    private static final String PASSWORD = "java123";
    
    static void mainLoop() {
        getAndCheckPasswordFromUser();
    }

    private static void getAndCheckPasswordFromUser() {
        boolean isCorrect = false;

        while (!isCorrect) {
            System.out.println("Podaj hasło: ");
            String input = Input.sc.nextLine();

            if (input.equals(PASSWORD)) {
                System.out.println("Zalogowano");
                isCorrect = true;
            } else {
                System.err.println("Hasło nieprawidłowe");
            }
        }
    }
}
