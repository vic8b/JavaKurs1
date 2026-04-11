package Homework.Homework_3;

class Task14 {
    static void mainLoop() {
        int[][] tab = new int[3][3];

        int numberToFill = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = numberToFill;
                numberToFill++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
