package Homework.FirstHomework;

public class Task5 {

    public static void mainLoop() {
        System.out.println("Podaj numer dnia tygodnia: ");
        int number = Input.sc.nextInt();
        Input.sc.nextLine();

        dayFromNumberPrinter(number);
    }

    private static void dayFromNumberPrinter(int number) {
        switch (number) {
            case 1:
                System.out.println(number + " - poniedziałek");
                break;
            case 2:
                System.out.println(number + " - wtorek");
                break;
            case 3:
                System.out.println(number + " - środa");
                break;
            case 4:
                System.out.println(number + " - czwartek");
                break;
            case 5:
                System.out.println(number + " - piątek");
                break;
            case 6:
                System.out.println(number + " - sobota");
                break;
            case 7:
                System.out.println(number + " - niedziela");
                break;
            default:
                System.out.println("Nieznany dzień");
        }
    }
}
