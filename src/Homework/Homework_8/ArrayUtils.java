package Homework.Homework_8;

public final class ArrayUtils {
    private ArrayUtils() {}

    public static <T> void swap(T[] arr, int i, int j) {
        if (arr == null) {
            throw new NullPointerException("arr cannot be null");
        }
        if (i >= arr.length || i < 0) {
            throw new IndexOutOfBoundsException("index i out of bounds");
        }
        if (j >= arr.length || j < 0) {
            throw new IndexOutOfBoundsException("index j out of bounds");
        }

        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T> int indexOf(T[] arr, T value) {
        int notFound = -1;

        for (int i = 0; i < arr.length; i++) {
            if (value == null) {
                if (arr[i] == value) {
                    return i;
                }
            }
            if (value != null) {
                if (value.equals(arr[i])) {
                    return i;
                }
            }
        }

        return notFound;
    }

    public static <T> int lastIndexOf(T[] arr, T value) {
        int lastFound = -1;

        for (int i = 0; i < arr.length; i++) {
            if (value == null) {
                if (arr[i] == value) {
                    lastFound = i;
                }
            }
            if (value != null) {
                if (value.equals(arr[i])) {
                    lastFound = i;
                }
            }
        }

        return lastFound;
    }

    public static <T> boolean arraysEqual(T[] a, T[] b) {
        boolean conformity = false;

        if (a == b) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (a[i] == b[i]) {
                    conformity = true;
                } else {
                    return false;
                }
            } else {
                if (a[i].equals(b[i])) {
                    conformity = true;
                } else {
                    return false;
                }
            }
        }
        return conformity;
    }
}