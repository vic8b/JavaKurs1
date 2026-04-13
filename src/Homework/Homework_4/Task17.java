package Homework.Homework_4;

class Task17 {
    public static void main(String[] args) {
        System.out.println("Enter value: ");
        int a = Input.sc.nextInt();
        Input.sc.nextLine();

        System.out.println("Enter value: ");
        int b = Input.sc.nextInt();
        Input.sc.nextLine();

        int gcd = gcd(a, b);

        System.out.println("Greatest common divisor of " + a + " and " + b + " is " + gcd);

        Input.scannerClose();
    }

    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
