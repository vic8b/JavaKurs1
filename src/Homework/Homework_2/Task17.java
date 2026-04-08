package Homework.Homework_2;

class Task17 {
    static void mainLoop() {
        System.out.println("Podaj liczbę (podstawa): ");
        int x = getNumberFromUser();
        
        boolean isPositive = false;
        int y = 0;
        while (!isPositive) {
            System.out.println("Podaj liczbę całkowitą dodatnią (wykładnik): ");
            y = getNumberFromUser();
            if (y > 0) {
                isPositive = true;
            } else {
                System.err.println("Liczba ujemna");
            }
        }

        int result = 1;

        for (int i = 0; i < y; i++) {
            result = result * x;
        }

        System.out.println("Wynik: " + result);

    }

    private static int getNumberFromUser() {
        int number = Input.sc.nextInt();
        Input.sc.nextLine();
        return number;
    }
}
