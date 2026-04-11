package Homework.Homework_3;

class Task20 {
    static void mainLoop() {
        int[][] tab = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Podaj element [" + i + "] [" + j + "] macierzy");
                tab[i][j] = Input.sc.nextInt();
                Input.sc.nextLine();
            }
        }

        System.out.println("Macierz przed modyfikacjami: ");
        matrixPrintout(tab);

        for (int j = 0; j < 5; j++) {
            int temp = tab[0][j];
            tab[0][j] = tab[4][j];
            tab[4][j] = temp;
        }

        System.out.println("Macierz po zamianie pierwszego i ostatniego wiersza: ");
        matrixPrintout(tab);

        System.out.println("Zamiana przekątnych:");
        for (int i = 0; i < 5; i++) {
            int temp = tab[i][i];
            tab[i][i] = tab[i][4 - i];
            tab[i][4 - i] = temp;
        }
        matrixPrintout(tab);
    }

    private static void matrixPrintout(int[][] tab) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
