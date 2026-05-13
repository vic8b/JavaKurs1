package Homework.Homework_8;

class Task4 {
    public static void main(String[] args) {
        String[] s = {"aa", "b", "ccc"};
        Pair<String, String> stringStringPair = MinMax.minMax(s);
        System.out.println("string array: " + stringStringPair);

        Integer[] a = {5, 5, -1, 10, 10};
        Pair<Integer, Integer> integerIntegerPair = MinMax.minMax(a);
        System.out.println("integers array: " + integerIntegerPair);

        Integer[] x = {42};
        Pair<Integer, Integer> singleValue = MinMax.minMax(x);
        System.out.println("single value: " + singleValue);

        Integer[] arr = {1, null, 2};
        Pair<Integer, Integer> arrWithNull = MinMax.minMax(arr);
        System.out.println(arrWithNull);
    }
}
