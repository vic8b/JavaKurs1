package Homework.FirstHomework;

class Task7 {
    private static final int AGE_OF_MAJORITY = 18;

    static void mainLoop() {
        System.out.println("Podaj wiek: ");
        int ageFromUser = Input.sc.nextInt();
        Input.sc.nextLine();

        checkAndPrintAge(ageFromUser);
    }

    private static void checkAndPrintAge(int ageFromUser) {
        String ageCheck = (ageFromUser >= AGE_OF_MAJORITY) ? "Pełnoletni" : "Niepełnoletni";
        System.out.println(ageCheck);
    }
}
