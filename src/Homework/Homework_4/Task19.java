package Homework.Homework_4;

class Task19 {
    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        int option = -1;

        while (option != EXIT) {
            menu();
            option = getOptionFromUser();
            optionSwitch(option);
        }

        System.out.println("Goodbye");

        Input.scannerClose();
    }

    private static void optionSwitch(int option) {
        switch (option) {
            case ADD -> add();
            case SUBTRACT -> subtract();
            case MULTIPLY -> multiply();
            case EXIT -> System.out.print("");
            default -> System.out.println("Unknown value");
        }
    }

    private static int getOptionFromUser() {
        int option;
        System.out.println("Enter option:");
        option = Input.sc.nextInt();
        Input.sc.nextLine();
        return option;
    }

    private static void menu() {
        System.out.println("Calculator options:");
        System.out.println("> " + ADD + " - add");
        System.out.println("> " + SUBTRACT + " - subtract");
        System.out.println("> " + MULTIPLY + " - multiply");
        System.out.println("> " + EXIT + " - exit");
    }

    private static void add() {
        int a = getValueFromUser();
        int b = getValueFromUser();
        int result = a + b;
        System.out.println("Result: " + result);
    }

    private static void subtract() {
        int a = getValueFromUser();
        int b = getValueFromUser();
        int result = a - b;
        System.out.println("Result: " + result);
    }

    private static void multiply() {
        int a = getValueFromUser();
        int b = getValueFromUser();
        int result = a * b;
        System.out.println("Result: " + result);
    }

    private static int getValueFromUser() {
        System.out.println("Enter value:");
        int value = Input.sc.nextInt();
        Input.sc.nextLine();
        return value;
    }
}
