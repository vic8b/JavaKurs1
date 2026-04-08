package Homework.Homework_2;

import java.util.Scanner;

class Input {
    static final Scanner sc = new Scanner(System.in);

    static void scannerClose() {
        sc.close();
    }

    static int getNumberFromUser() {
        System.out.println("Podaj liczbę: ");
        int input = Input.sc.nextInt();
        Input.sc.nextLine();
        return input;
    }
}
