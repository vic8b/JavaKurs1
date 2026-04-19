package Homework.Homework_7;

class Task19 {
    public static void main(String[] args) {
        int testA = 10;
        int testB = 2;
        System.out.println("Test numbers (ints): " + testA + " and " + testB);
        System.out.println();

        System.out.println("Calculation enum test (abstract method)");
        for (Calculation calculation : Calculation.values()) {
            int calculationResult = calculation.calculate(testA, testB);
            System.out.println("Calculation " + calculation + " result: " + calculationResult);
        }
    }
}
