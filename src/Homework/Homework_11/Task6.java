package Homework.Homework_11;

import java.util.Optional;

class Task6 {
    public static void main(String[] args) {
        String[] nicki = {"Janek", null, "Ania", null, "Kuba"};

        System.out.println("Version A: ");
        for (String nick : nicki) {
            Optional<String> nickOpt = Optional.ofNullable(nick);

            nickOpt.ifPresent(foundNick -> System.out.println("Found: " + foundNick));
        }

        System.out.println();

        System.out.println("Version B:");
        for (String nick : nicki) {
            Optional<String> nickOpt = Optional.ofNullable(nick);

            nickOpt.ifPresentOrElse(foundNick -> System.out.println("Found: " + nick), () -> System.out.println("Nick not found"));
        }
    }
}
