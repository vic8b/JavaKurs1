package Homework.Homework_10;

import java.util.Scanner;
import java.util.function.BiFunction;

class Task4 {
    static Scanner sc = new Scanner(System.in);

    static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }

    static BiFunction<Integer, Integer, Integer> getFunction(String fromUser) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> div = (a, b) -> a / b;

        switch (fromUser) {
            case "+" -> {
                return add;
            }
            case "-" -> {
                return sub;
            }
            case "*" -> {
                return mul;
            }
            case "/" -> {
                return div;
            }
            default -> throw new IllegalArgumentException("Unknown operator");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter b: ");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter operator (+ - * /): ");
        String operator = sc.nextLine();

        System.out.println("Calculation result: " + calculate(a, b, getFunction(operator)));
    }
}
