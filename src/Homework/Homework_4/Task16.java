package Homework.Homework_4;

class Task16 {
    public static void main(String[] args) {
        System.out.println("Enter value: ");
        int value = Input.sc.nextInt();
        Input.sc.nextLine();

        System.out.println("Sum of digits:");
        System.out.println(sumDigitsRec(value));

        Input.scannerClose();
    }

    private static int sumDigitsRec(int value) {
        if (value == 0) {
            return 0;
        }

        return (value % 10) + sumDigitsRec(value / 10);
    }
}
