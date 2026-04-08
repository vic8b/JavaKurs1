package Homework.Homework_2;

class Task14 {
    static void mainLoop() {
        int firstNumber = Input.getNumberFromUser();
        int secondNumber = Input.getNumberFromUser();

        checkDivisibleBy3Or5(firstNumber, secondNumber);
    }

    private static void checkDivisibleBy3Or5(int firstNumber, int secondNumber) {
        int start;
        int end;
        if (firstNumber < secondNumber) {
            start = firstNumber;
            end = secondNumber;
            printDivisibleNumbers(start, end);
        } else if (secondNumber < firstNumber) {
            start = secondNumber;
            end = firstNumber;
            printDivisibleNumbers(start, end);
        } else {
            System.err.println("Podaj przedział liczb");
        }
    }

    private static void printDivisibleNumbers(int start, int end) {
        System.out.println("Liczby podzielne przez 3 lub 5 z przedziału " + start + " i " + end);
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
