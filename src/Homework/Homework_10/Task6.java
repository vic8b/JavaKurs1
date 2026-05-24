package Homework.Homework_10;

import java.util.function.Predicate;

class Task6 {
    public static void main(String[] args) {
        String[] loginy = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};

        Predicate<String> isValidLogin = s -> s.length() >= 3 && s.matches("[a-zA-Z0-9]+")
                    && Character.isLetter(s.charAt(0));

        int counter = 0;

        for (int i = 0; i < loginy.length; i++) {
            if (isValidLogin.test(loginy[i])) {
                counter++;
                System.out.println("Correct login: " + loginy[i]);
            }
        }
        System.out.println("Correct logins: " + counter);
    }
}
