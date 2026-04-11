package Homework.Homework_3;

import java.util.Arrays;

class Task3 {
    static void mainLoop() {
        int n = Input.getNumberFromUser();

        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i+1;
        }

        System.out.println("Zawartość tablicy:");
        Arrays.stream(ints).forEach(System.out::println);
    }
}
