package Homework.Homework_3;

import java.util.Arrays;

class Task11 {
    static void mainLoop() {
        int arrayLength = ArraysUtils.getArrayLengthFromUser();
        int[] ints = ArraysUtils.createArrayWithValues(arrayLength);

        System.out.println("Tablica przed zmianą: " + Arrays.toString(ints));

        exchangeFirstAndLastArrayElement(ints);
        System.out.println("Zamiana pierwszego elementu z ostatnim elementem");

        System.out.println("Tablica po zmianie: " + Arrays.toString(ints));
    }

    private static void exchangeFirstAndLastArrayElement(int[] ints) {
        int temp;
        int lastId = ints.length - 1;

        temp = ints[0];
        ints[0] = ints[lastId];
        ints[lastId] = temp;
    }
}
