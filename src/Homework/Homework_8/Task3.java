package Homework.Homework_8;

class Task3 {
    public static void main(String[] args) {
        System.out.println("Mean, variance (a)");
        Integer[] a = {1, 2, 3, 4};

        Stats<Integer> statsA = new Stats<>(a);
        System.out.println("mean: " + statsA.mean());
        System.out.println("variance: " + statsA.variance());
        //ok

        Double[] x = {2.0, 2.0};
        Double[] y = {2.001, 1.999};
        double eps = 0.01;

        System.out.println("Same mean (x, y)");
        Stats<Double> statsX = new Stats<>(x);
        Stats<Double> statsY = new Stats<>(y);

        boolean hasSameMean = statsX.hasSameMean(statsY, eps);
        System.out.println("has same mean: " + hasSameMean);

        System.out.println("Blank array");
        Integer[] blankArray1 = new Integer[0];
        Integer[] blankArray2 = new Integer[1];

        System.out.println("Exception when creating Stats object:");

        //IllegalArgumentException: array is empty
        Stats<Integer> integerStats1 = new Stats<>(blankArray1);

        //IllegalArgumentException: array has null values
        Stats<Integer> integerStats2 = new Stats<>(blankArray2);
    }
}
