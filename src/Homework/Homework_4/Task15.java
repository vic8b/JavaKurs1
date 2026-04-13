package Homework.Homework_4;

class Task15 {
    public static void main(String[] args) {
        System.out.println("Enter value: ");
        int value = Input.sc.nextInt();
        Input.sc.nextLine();

        System.out.println("Sum of digits:");
        System.out.println(sumDigitsIter(value));

        Input.scannerClose();
    }

    private static int sumDigitsIter(int value) {
        int sum = 0;

        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }

        return sum;
    }
}
