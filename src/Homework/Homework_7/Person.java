package Homework.Homework_7;

class Person {
    private String name;
    private DayOfWeek dayOff;

    Person(String name, DayOfWeek dayOff) {
        this.name = name;
        this.dayOff = dayOff;
    }

    public void showDayOff() {
        System.out.println("Day off: " + dayOff);
    }
}
