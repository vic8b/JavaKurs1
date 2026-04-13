package Homework.Homework_4;

import java.util.Arrays;

class Task10 {
    public static void main(String[] args) {
        int[] tab = {10, 20, 30, 45, 80};

        int sumOfArray = sumOfArray(tab);
        System.out.println("Sum of array: " + Arrays.toString(tab) + " is: " + sumOfArray);
    }

    private static int sumOfArray(int[] tab) {
        int sum = 0;
        for (int value : tab) {
            sum += value;
        }

        return sum;
    }
}
