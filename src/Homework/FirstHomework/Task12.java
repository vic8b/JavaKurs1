package Homework.FirstHomework;

import java.time.YearMonth;

class Task12 {
    public static void mainLoop() {
        int year = getYearFromUser();
        int month = getMonthFromUser();
        int day = getDayFromUser();

        checkIfDateIsCorrect(day, month, year);
    }

    private static boolean dateIsCorrect(int day, int month, int year) {
        if (month >= 1 && month <= 12) {
            YearMonth yearMonth = YearMonth.of(year, month);
            int monthDays = yearMonth.lengthOfMonth();
            return day >= 1 && day <= monthDays;
        } else {
            return false;
        }
    }

    private static void checkIfDateIsCorrect(int day, int month, int year) {
        if (dateIsCorrect(day, month, year)) {
            System.out.println("Data poprawna");
        } else {
            System.out.println("Data niepoprawna");
        }
    }

    private static int getDayFromUser() {
        System.out.println("Podaj dzień");
        return Input.sc.nextInt();
    }

    private static int getMonthFromUser() {
        System.out.println("Podaj miesiąc");
        return Input.sc.nextInt();
    }

    private static int getYearFromUser() {
        System.out.println("Podaj rok");
        return Input.sc.nextInt();
    }
}
