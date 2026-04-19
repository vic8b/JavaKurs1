package Homework.Homework_7;

import java.util.Arrays;

class Task17 {
    public static void main(String[] args) {
        System.out.println("Options:");
        System.out.println(Arrays.toString(MenuOption.values()));

        try {
            System.out.println("Enter option: ");
            MenuOption userOption = MenuOption.valueOf(Input.sc.nextLine().toUpperCase());
            switch (userOption) {
                case START -> System.out.println("Start");
                case STOP -> System.out.println("Stop");
                case EXIT -> System.out.println("Exit");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Incorrect option");
        }

        Input.scannerClose();
    }
}
