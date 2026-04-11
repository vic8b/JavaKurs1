package Homework.Homework_3;

import java.util.Arrays;

class Task12 {
    static void mainLoop() {
        int arrayLength = ArraysUtils.getArrayLengthFromUser();
        int[] ints1 = ArraysUtils.createArrayWithValues(arrayLength);
        int[] ints2 = ArraysUtils.createArrayWithValues(arrayLength);

        int[] summedArrays = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            summedArrays[i] = ints1[i] + ints2[i];
        }

        System.out.println("Tablica zsumowanych wartości: " + Arrays.toString(summedArrays));
    }
}
