package Homework.Homework_2;

class Task16 {
    static int counter = 0;

    static void mainLoop() {
        int number = getNumberFromUser();

        countDigitsFromNumber(number);
        System.out.println("Liczba cyfr w liczbie: " + counter);
    }

    private static void countDigitsFromNumber(int number) {
        if (number == 0) {
            counter = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                counter++;
            }
        }
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbę całkowitą dodatnią: ");
        int number = Input.sc.nextInt();
        Input.sc.nextLine();
        return number;
    }
}
