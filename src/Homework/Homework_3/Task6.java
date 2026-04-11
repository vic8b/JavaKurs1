package Homework.Homework_3;

import java.util.Arrays;

class Task6 {
    static void mainLoop() {
        int arrayLength = ArraysUtils.getArrayLengthFromUser();
        int[] ints = ArraysUtils.createArrayWithValues(arrayLength);

        getBiggestNumberFromArray(ints);
    }

    private static void getBiggestNumberFromArray(int[] ints) {
        Arrays.sort(ints);
        int biggestNumber = ints[ints.length - 1];
        System.out.println("Największa liczba z tablicy to: " + biggestNumber);
    }
}
