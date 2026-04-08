package Homework.Homework_2;

class Task12 {
    private static final int EXIT = 0;

    static void mainLoop() {
        int number = -1;
        int sum = 0;

        while (number != EXIT) {
            System.out.println("Aby wyjść - " + EXIT);
            number = Input.getNumberFromUser();

            if (number > 0) {
                sum += number;
            }
        }

        System.out.println("Suma liczb dodatnich: " + sum);
    }
}
