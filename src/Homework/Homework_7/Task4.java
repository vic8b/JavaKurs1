package Homework.Homework_7;

class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter day of the week:");
        DayOfWeek dayFromUser = DayOfWeek.valueOf(Input.sc.nextLine().toUpperCase());

        switch (dayFromUser) {
            case MONDAY -> System.out.println("Beginning of the week");
            case TUESDAY -> System.out.println("Beginning of the week");
            case WEDNESDAY -> System.out.println("Middle of the week");
            case THURSDAY -> System.out.println("Middle of the week");
            case FRIDAY -> System.out.println("End of the week");
            case SATURDAY -> System.out.println("End of the week");
            case SUNDAY -> System.out.println("End of the week");
        }

        Input.scannerClose();
    }
}
