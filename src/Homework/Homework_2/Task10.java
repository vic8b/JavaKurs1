package Homework.Homework_2;

class Task10 {
    private static final int DIVIDED_BY = 7;

    static void mainLoop() {
        int n = Input.getNumberFromUser();
        checkDividation(n);
    }

    private static void checkDividation(int n) {
        for (int i = n + 1;; i++) {
            if (i % DIVIDED_BY == 0) {
                System.out.println("Kolejna liczba podzielna przez " + DIVIDED_BY + " to: " + i);
                break;
            }
        }
    }
}
