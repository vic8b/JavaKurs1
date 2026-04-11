package Homework.Homework_3;

import java.util.Arrays;

class Task5 {
    static void mainLoop() {
        int[] ints = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : ints) {
            sum += i;
        }

        double average = (double) sum / ints.length;

        System.out.println("Średnia liczb z tablicy: " + Arrays.toString(ints) + " to " + average);
    }
}
