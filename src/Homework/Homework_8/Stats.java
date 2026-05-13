package Homework.Homework_8;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("array is empty");
        }

        for (T datum : data) {
            if (datum == null) {
                throw new IllegalArgumentException("array has null values");
            }
        }

        this.data = data;
    }

    public double mean() {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i].doubleValue();
        }

        return sum / data.length;
    }

    public double variance() { /* wariancja populacyjna */
        double variance = 0;

        for (int i = 0; i < data.length; i++) {
            variance += Math.pow(data[i].doubleValue() - mean(), 2);
        }

        return variance / data.length;
    }

    public boolean hasSameMean(Stats<?> other, double eps) { /* |m1-m2| <= eps */
        return Math.abs(mean() - other.mean()) <= eps;
    }
}
