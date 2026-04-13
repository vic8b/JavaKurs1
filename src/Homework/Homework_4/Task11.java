package Homework.Homework_4;

import java.util.Arrays;

class Task11 {
    public static void main(String[] args) {
        int[] tab1 = {10, 20, 130, 45, 80};

        int maxValue1 = maxInArray(tab1);
        System.out.println("Max value in array: " + Arrays.toString(tab1) + " is: " + maxValue1);

        int[] tab2 = {10, 320, 130, 5545, 80};

        int maxValue2 = maxInArray(tab2);
        System.out.println("Max value in array: " + Arrays.toString(tab2) + " is: " + maxValue2);
    }

    private static int maxInArray(int[] tab) {
        int max = Integer.MIN_VALUE;

        for (int value : tab) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}
