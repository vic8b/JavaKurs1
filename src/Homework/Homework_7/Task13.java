package Homework.Homework_7;

class Task13 {
    public static void main(String[] args) {
        int testA = 10;
        int testB = 2;
        System.out.println("Test numbers (ints): " + testA + " and " + testB);
        System.out.println();

        System.out.println("Test operations");
        for (Operation operation : Operation.values()) {
            int operationResult = operation.calculate(testA, testB);
            System.out.println("Operation " + operation + " result: " + operationResult);
        }
    }
}
