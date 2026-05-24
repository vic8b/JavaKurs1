package Homework.Homework_10;

class Task12 {
    public static void main(String[] args) {
        TriFunction<Double, Double, Double, Double> weightedAverage = (grade, weight, maxWeight)
                -> grade * weight / maxWeight;

        double[] oceny = {3.0, 4.5, 5.0};
        double[] wagi  = {1.0, 2.0, 3.0};

        double sumOfWeights = 0;
        for (double w : wagi) sumOfWeights += w;

        double avg = 0;

        if (oceny.length == wagi.length) {
            for (int i = 0; i < oceny.length; i++) {
                System.out.println("Weighted average for " + oceny[i] + " and " + wagi[i]);
                System.out.println(weightedAverage.apply(oceny[i], wagi[i], sumOfWeights));

                avg += weightedAverage.apply(oceny[i], wagi[i], sumOfWeights);
            }
        } else {
            throw new IllegalArgumentException("grades != weights");
        }

        System.out.println("Average: " + avg);
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
