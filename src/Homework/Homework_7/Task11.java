package Homework.Homework_7;

class Task11 {
    public static void main(String[] args) {
        Month[] monthsArray = {
                Month.APRIL,
                Month.MAY,
                Month.DECEMBER
        };

        int totalDays = 0;

        for (Month month : monthsArray) {
            System.out.println(month);
            totalDays += month.getDays();
        }

        System.out.println("Sum of the days from given months: " + totalDays);
    }
}
