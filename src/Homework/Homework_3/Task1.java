package Homework.Homework_3;

import java.util.Arrays;

class Task1 {
    static void mainLoop() {
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }

        Arrays.stream(ints).forEach(System.out::println);
    }
}
