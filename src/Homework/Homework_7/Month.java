package Homework.Homework_7;

enum Month {
    JANUARY(31, false),
    FEBRUARY(28, false),
    MARCH(31, false),
    APRIL(30, false),
    MAY(31, false),
    JUNE(30, false),
    JULY(31, true),
    AUGUST(31, true),
    SEPTEMBER(30, false),
    OCTOBER(30, false),
    NOVEMBER(30, false),
    DECEMBER(31, false);

    private final int days;
    private final boolean isHolidaySeason;

    Month(int days, boolean isHolidaySeason) {
        this.days = days;
        this.isHolidaySeason = isHolidaySeason;
    }

    public int getDays() {
        return days;
    }


    @Override
    public String toString() {
        return name() + " (days: " + days + "); isHolidaySeason: " + isHolidaySeason;
    }
}
