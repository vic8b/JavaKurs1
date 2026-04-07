package Homework.FirstHomework;

class Task9 {
    public static void mainLoop() {
        double a = getNumberFromUser();
        double b = getNumberFromUser();
        String operator = getOperatorFromUser();

        calculate(operator, a, b);
    }

    private static void calculate(String operator, double a, double b) {
        switch (operator) {
            case "+" -> sum(a, b);
            case "-" -> subtract(a, b);
            case "*" -> multiply(a, b);
            case "/" -> divide(a, b);
            case "%" -> modulo(a, b);
            default -> System.out.println("nieznany operator");
        }
    }



    private static String getOperatorFromUser() {
        System.out.println("Podaj operator: ");
        return Input.sc.nextLine();
    }

    private static double getNumberFromUser() {
        System.out.println("Podaj liczbę: ");
        double a = Input.sc.nextInt();
        Input.sc.nextLine();
        return a;
    }

    private static void modulo(double a, double b) {
        System.out.println("Wynik: ");
        double result = a % b;
        System.out.println(result);
    }

    private static void divide(double a, double b) {
        if (b == 0) {
            System.err.println("Nie można dzielić przez 0");
        } else {
            System.out.println("Wynik: ");
            double result = a / b;
            System.out.println(result);
        }
    }

    private static void multiply(double a, double b) {
        System.out.println("Wynik: ");
        double result = a * b;
        System.out.println(result);
    }

    private static void subtract(double a, double b) {
        System.out.println("Wynik: ");
        double result = a - b;
        System.out.println(result);
    }

    private static void sum(double a, double b) {
        System.out.println("Wynik: ");
        double result = a + b;
        System.out.println(result);
    }
}
