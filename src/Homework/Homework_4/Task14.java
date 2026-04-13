package Homework.Homework_4;

import java.util.Arrays;

class Task14 {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 10, 22};
        int[] tab2 = {2, 4, 6, 8, 10};

        int[] mergedTabs = mergeTabs(tab1, tab2);
        System.out.println(Arrays.toString(mergedTabs));

    }

    private static int[] mergeTabs(int[] tab1, int[] tab2) {
        int[] mergedTabs = new int[tab1.length + tab2.length];
        int posInTab = 0;

        for (int i = 0; i < tab1.length; i++) {
            mergedTabs[posInTab] = tab1[i];
            posInTab++;
        }
        for (int i = 0; i < tab2.length; i++) {
            mergedTabs[posInTab] = tab2[i];
            posInTab++;
        }

        return mergedTabs;
    }
}
