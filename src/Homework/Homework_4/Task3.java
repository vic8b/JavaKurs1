package Homework.Homework_4;

class Task3 {
    public static void main(String[] args) {
        int firstNumber = Input.getIntFromUser();
        int secondNumber = Input.getIntFromUser();

        int maxResult = max(firstNumber, secondNumber);
        System.out.printf("Bigger number from the numbers %d and %d is: %d", firstNumber, secondNumber, maxResult);

        Input.scannerClose();
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
