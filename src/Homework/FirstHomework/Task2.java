package Homework.FirstHomework;

class Task2 {
    static void mainLoop() {
        int number = getNumberFromUser();
        numberIsEven(number);
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbę całkowitą: ");
        int number = Input.sc.nextInt();
        Input.sc.nextLine();
        return number;
    }

    private static void numberIsEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
