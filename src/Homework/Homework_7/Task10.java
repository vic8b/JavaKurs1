package Homework.Homework_7;

class Task10 {
    public static void main(String[] args) {
        Person testPerson1 = new Person("John", DayOfWeek.THURSDAY);
        Person testPerson2 = new Person("Mike", DayOfWeek.WEDNESDAY);
        Person testPerson3 = new Person("Andrew", DayOfWeek.FRIDAY);

        System.out.println("Person 1:");
        testPerson1.showDayOff();

        System.out.println("Person 2:");
        testPerson2.showDayOff();

        System.out.println("Person 3:");
        testPerson3.showDayOff();
    }
}
