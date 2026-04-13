package Homework.Homework_4;

class Task12 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check: ");
        int number = Input.sc.nextInt();
        Input.sc.nextLine();

        printIfNumberIsPrime(number);

        Input.scannerClose();
    }

    private static void printIfNumberIsPrime(int number) {
        String result = (isPrime(number)) ? "Number is a prime number" : "Number isn't a prime number";
        System.out.println(result);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
