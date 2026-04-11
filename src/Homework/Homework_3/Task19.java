package Homework.Homework_3;

class Task19 {
    static void mainLoop() {
        int[][] tab = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tab[i][j] = i * 10 + j;
            }
        }

        printMatrix(tab);
        printDiagonal(tab);
    }

    private static void printDiagonal(int[][] tab) {
        System.out.println("Przekątna:");
        for (int i = 0; i < 10; i++) {
            System.out.println(tab[i][i] + " ");
        }
    }

    private static void printMatrix(int[][] tab) {
        System.out.println("Macierz:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
