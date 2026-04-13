package Homework.Homework_4;

class Task4 {
    public static void main(String[] args) {
        int numberFromUser = Input.getIntFromUser();

        String result = (isEven(numberFromUser)) ? "Number is even" : "Number is not even";
        System.out.println(result);

        Input.scannerClose();
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
