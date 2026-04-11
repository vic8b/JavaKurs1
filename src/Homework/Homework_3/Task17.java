package Homework.Homework_3;

class Task17 {
    static void mainLoop() {
        int[][] tab = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Podaj element [" + i + "],[" + j + "] macierzy");
                tab[i][j] = Input.sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += tab[i][j];
            }
            System.out.println("Suma kolumny " + (j + 1) + " to: " + sum);
        }
    }
}
