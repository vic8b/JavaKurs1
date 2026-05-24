package Homework.Homework_10;

import java.util.function.Function;

class Task2 {
    public static void main(String[] args) {
        Function<String, String> spaceRemover = s -> s.replaceAll(" ", "");
        Function<String, String> toLowerCase = String::toLowerCase;

        Function<String, String> normalizeLogin = spaceRemover.andThen(toLowerCase);


        String[] logins = {"  Adam  ", "ANIA K  ", "  k o w a l "};
        String[] normalizedLogins = new String[logins.length];

        for (int i = 0; i < logins.length; i++) {
            normalizedLogins[i] = normalizeLogin.apply(logins[i]);
        }

        System.out.println("Normalized logins:");
        for (String login : normalizedLogins) {
            System.out.println(login);
        }
    }
}
