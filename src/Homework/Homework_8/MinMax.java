package Homework.Homework_8;

public final class MinMax {
    private MinMax() {}

    public static <T extends Comparable<? super T>> Pair<T,T> minMax(T[] arr) {
        // zwróć parę (min, max); pusta tablica → IllegalArgumentException
        if (arr == null) {
            throw new NullPointerException("arr cannot be null");
        }

        if (arr.length == 0) {
            throw new IllegalArgumentException("array is blank");
        }

        for (T t : arr) {
            if (t == null) {
                throw new IllegalArgumentException("array has null elements");
            }
        }

        T min = arr[0];
        T max = arr[0];

        for (T t : arr) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }

        return Pair.of(min, max);
    }
}
