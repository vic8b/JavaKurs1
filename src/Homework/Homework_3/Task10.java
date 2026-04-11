package Homework.Homework_3;

import java.util.Arrays;

class Task10 {
    static void mainLoop() {
        int arrayLength = ArraysUtils.getArrayLengthFromUser();
        int[] ints = ArraysUtils.createArrayWithValues(arrayLength);

        // solution 1
//        for (int i = ints.length; i > 0; i--) {
//            System.out.println(i);
//        }

        // solution 2
        int[] intsReversed = createNewReversedArray(ints);

        System.out.println("Odwrócona tablica:");
        System.out.println(Arrays.toString(intsReversed));

    }

    private static int[] createNewReversedArray(int[] ints) {
        int counter = 0;
        int[] intsReversed = new int[ints.length];
        for (int i = ints.length - 1; i >= 0; i--) {
            intsReversed[counter] = ints[i];
            counter++;
        }
        return intsReversed;
    }
}
