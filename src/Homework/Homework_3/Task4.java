package Homework.Homework_3;

import java.util.Arrays;

class Task4 {
    static void mainLoop() {
        int[] ints = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : ints) {
            sum += i;
        }
        System.out.println("Suma liczb z tablicy: " + Arrays.toString(ints) + " to " + sum);
    }
}
