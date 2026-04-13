package Homework.Homework_4;

import java.util.Scanner;

class Input {
    static final Scanner sc = new Scanner(System.in);

    static void scannerClose() {
        sc.close();
    }

    static int getIntFromUser() {
        System.out.println("Enter a number: ");
        int input = Input.sc.nextInt();
        Input.sc.nextLine();
        return input;
    }

    static double getDoubleFromUser() {
        System.out.println("Enter a number: ");
        double input = Input.sc.nextDouble();
        Input.sc.nextLine();
        return input;
    }
}