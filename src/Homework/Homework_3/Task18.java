package Homework.Homework_3;

class Task18 {
    static void mainLoop() {
        int n = getNumberOfRowsFromUser();
        int m = getNumberOfColumnsFromUser();

        int[][] tab = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Podaj element [" + i + "] [" + j + "] macierzy");
                tab[i][j] = Input.sc.nextInt();
                Input.sc.nextLine();
            }
        }

        int max = tab[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tab[i][j] > max) {
                    max = tab[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        System.out.println("Największy element: " + max);
        System.out.println("Jego pozycja: wiersz " + (maxRow + 1) + ", kolumna " + (maxColumn + 1));

        int max3 = getThirdMax(n, m, tab);

        System.out.println("Trzeci największy element: " + max3);
    }

    private static int getThirdMax(int n, int m, int[][] tab) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = tab[i][j];

                if (x > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = x;
                } else if (x > max2 && x != max1) {
                    max3 = max2;
                    max2 = x;
                } else if (x > max3 && x != max2 && x != max1) {
                    max3 = x;
                }
            }
        }
        return max3;
    }

    private static int getNumberOfColumnsFromUser() {
        System.out.println("Podaj liczbę kolumn:");
        int m = Input.sc.nextInt();
        Input.sc.nextLine();
        return m;
    }

    private static int getNumberOfRowsFromUser() {
        System.out.println("Podaj liczbę wierszy: ");
        int n = Input.sc.nextInt();
        Input.sc.nextLine();
        return n;
    }
}
