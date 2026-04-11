package Homework.Homework_3;

class Task15 {
    static void mainLoop() {
        int[][] tab = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Podaj element [" + i + "],[" + j + "] macierzy");
                tab[i][j] = Input.sc.nextInt();
                Input.sc.nextLine();
            }
        }

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += tab[i][j];
            }
        }

        System.out.println("Suma wszystkich elementów macierzy: " + sum);
    }
}
