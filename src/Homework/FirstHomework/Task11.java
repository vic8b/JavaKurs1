package Homework.FirstHomework;

class Task11 {

    public static void mainLoop() {
        System.out.println("Podaj rok do sprawdzenia przestępnośći: ");
        int yearFromUser = Input.sc.nextInt();
        Input.sc.nextLine();

        // % 4 != 0 -> not leap
        // % 4 = 0 && % 100 = 0 -> not leap
        // % 100 = 0 && % 400 = 0

//        could've used GregorianCalendar static method
//        boolean isLeapYear = new GregorianCalendar().isLeapYear(yearFromUser);

        printIsLeapYear(yearFromUser);
    }

    private static void printIsLeapYear(int yearFromUser) {
        if (isLeapYear(yearFromUser)) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nieprzestępny");
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    }
}
