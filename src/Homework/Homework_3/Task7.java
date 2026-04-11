package Homework.Homework_3;

import java.util.Arrays;

class Task7 {
    static void mainLoop() {
        int arrayLength = ArraysUtils.getArrayLengthFromUser();
        int[] ints = ArraysUtils.createArrayWithValues(arrayLength);

        getSmallestNumberFromArray(ints);
    }

    private static void getSmallestNumberFromArray(int[] ints) {
        Arrays.sort(ints);
        int lowestNumber = ints[0];
        System.out.println("Najmniejsza liczba z tablicy to: " + lowestNumber);
    }
}
