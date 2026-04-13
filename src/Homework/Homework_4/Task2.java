package Homework.Homework_4;

class Task2 {
    public static void main(String[] args) {
        int firstNumberFromUser = Input.getIntFromUser();
        int secondNumberFromUser = Input.getIntFromUser();

        int multResult = mult(firstNumberFromUser, secondNumberFromUser);
        System.out.println("Result from the method: " + multResult);

        Input.scannerClose();
    }

    private static int mult(int a, int b) {
        return a * b;
    }
}
