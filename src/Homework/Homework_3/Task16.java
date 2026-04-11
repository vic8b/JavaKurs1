package Homework.Homework_3;

class Task16 {
    static void mainLoop() {
        int[][] tab = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Podaj element [" + i + "],[" + j + "] macierzy");
                tab[i][j] = Input.sc.nextInt();
                Input.sc.nextLine();
            }
        }

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += tab[i][j];
            }
            System.out.println("Suma wiersza " + (i + 1) + " to: " + sum);
        }
    }
}
