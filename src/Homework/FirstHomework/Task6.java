package Homework.FirstHomework;

class Task6 {
    static void mainLoop() {
        System.out.println("Podaj numer dnia tygodnia: ");
        int number = Input.sc.nextInt();
        Input.sc.nextLine();

        dayFromNumberPrinter(number);
    }

    private static void dayFromNumberPrinter(int number) {
        String dayOfTheWeek = switch (number) {
            case 1 -> number + " - poniedziałek";
            case 2 -> number + " - wtorek";
            case 3 -> number + " - środa";
            case 4 -> number + " - czwartek";
            case 5 -> number + " - piątek";
            case 6 -> number + " - sobota";
            case 7 -> number + " - niedziela";
            default -> "Nieznany dzień";
        };

        System.out.println(dayOfTheWeek);
    }
}
