package Homework.Homework_2;

class Task15 {
    static void mainLoop() {
        int n = Input.getNumberFromUser();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Silnia liczby " + n + " to: " + fact);
    }
}
