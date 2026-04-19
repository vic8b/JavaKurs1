package Homework.Homework_7;

class Task8 {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.println("Month: " + month + "; ordinal: " + month.ordinal());
        }

        System.out.println();

        System.out.println("Showcase of usage");
        Month showcaseMonth1 = Month.APRIL;
        Month showcaseMonth2 = Month.MAY;
        System.out.println("Month 1: " + showcaseMonth1);
        System.out.println("Month 2: " + showcaseMonth2);

        int comparisonOfAprilAndMay = showcaseMonth1.compareTo(showcaseMonth2);
        System.out.println("compareTo value: " + comparisonOfAprilAndMay);

        if (comparisonOfAprilAndMay == 0) {
            System.out.println("Months ordinal is equal");
        } else if (comparisonOfAprilAndMay < 0) {
            System.out.println(showcaseMonth1.name() + " is before " + showcaseMonth2.name());
        } else {
            System.out.println(showcaseMonth1.name() + " is after " + showcaseMonth2.name());
        }
    }
}
