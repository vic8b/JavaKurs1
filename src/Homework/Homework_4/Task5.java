package Homework.Homework_4;

class Task5 {
    public static void main(String[] args) {
        double firstNumber = Input.getDoubleFromUser();
        double secondNumber = Input.getDoubleFromUser();
        double thirdNumber = Input.getDoubleFromUser();

        System.out.printf("Reslt of given method is %.2f", averageOfThreeNumbers(firstNumber, secondNumber, thirdNumber));

        Input.scannerClose();
    }

    private static double averageOfThreeNumbers(double a, double b, double c) {
        double sum = a + b + c;
        return sum / 3;
    }
}
