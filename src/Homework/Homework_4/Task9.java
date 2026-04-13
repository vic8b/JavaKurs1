package Homework.Homework_4;

class Task9 {
    public static void main(String[] args) {
        int testNumber1 = 5;
        int testNumber2 = 4;
        int testNumber3 = 20;

        int factorial1 = factorialRec(testNumber1);
        int factorial2 = factorialRec(testNumber2);
        int factorial3 = factorialRec(testNumber3);

        System.out.println(factorial1);
        System.out.println(factorial2);
        System.out.println(factorial3);

        // results are the same as in iteration version
    }

    private static int factorialRec(int number) {
        if (number <= 2) {
            return number;
        }
        return number * factorialRec(number - 1);
    }
}
