package Homework.Homework_4;

import java.util.Arrays;

class Task13 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 10, 22};
        System.out.println("Prime tab");
        System.out.println(Arrays.toString(tab));

        System.out.println("Reversed tab");
        int[] reversedTab = reverseTab(tab);
        System.out.println(Arrays.toString(reversedTab));
    }

    private static int[] reverseTab(int[] tab) {
        int counter = 0;
        int[] reversedTab = new int[tab.length];

        for (int i = tab.length - 1; i >= 0; i--) {
            reversedTab[counter] = tab[i];
            counter++;
        }

        return reversedTab;
    }
}
