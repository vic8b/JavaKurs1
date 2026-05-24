package Homework.Homework_11;

import java.util.Optional;

class Task7 {
    public static void main(String[] args) {
        System.out.println(extractLogin(Optional.of("jan.kowalski@example.com")));
        System.out.println(extractLogin(Optional.empty()));
    }

    static Optional<String> extractLogin(Optional<String> email) {
        return email.map(emailOpt -> emailOpt.split("@")[0])
                .map(String::toUpperCase);
    }
}
