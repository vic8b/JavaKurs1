package Homework.Homework_4;

class Task8 {
    public static void main(String[] args) {
        int testNumber1 = 5;
        int testNumber2 = 4;
        int testNumber3 = 8;

        int factorial1 = factorialIter(testNumber1);
        int factorial2 = factorialIter(testNumber2);
        int factorial3 = factorialIter(testNumber3);

        System.out.println(factorial1);
        System.out.println(factorial2);
        System.out.println(factorial3);

    }

    private static int factorialIter(int number) {
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }
}