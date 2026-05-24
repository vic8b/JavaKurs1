package Homework.Homework_11;

import java.util.Optional;

class Task4 {
    public static void main(String[] args) {
        String test = "abcdfgh";
        System.out.println("Test string: " + test);

        Optional<String> testOpt = Optional.of(test);
        Optional<String> emptyOpt = Optional.empty();

        System.out.println(test + " orElse(generateDefault()): " + testOpt.orElse(generateDefault()));
        System.out.println(test + " orElseGet(() -> generateDefault()): " + testOpt.orElseGet(() -> generateDefault()));
        System.out.println("empty opt orElse(generateDefault()): " + emptyOpt.orElse(generateDefault()));
        System.out.println("empty opt orElse(generateDefault()): " + emptyOpt.orElseGet(() -> generateDefault()));

        // orElse - kiedy chcemy za każdym razem wywolać metodę i jest to dla nas potrzebne
        // orElseGet - jeżeli chcemy wywołać metodę tylko, gdy optional jest pusty i nie jest potrzebne wywołanie za każdym razem
    }

    static String generateDefault() {
        System.out.println(" >> Generating default value...");
        return "DEFAULT";
    }
}
