package Homework.Homework_11;

import java.util.List;
import java.util.Optional;

class Task10 {
    public static void main(String[] args) {
        List<String> keys = List.of("A", "B", "C");

        for (String key : keys) {
            System.out.println("found value for key " + key + ": " + findValue(key));
        }

        //supplier makes the lazy part in case of method usages (.or)
    }

    static Optional<String> findInCache(String key) {
        System.out.println("Searching in cache...");

        if (key.equals("A")) {
            return Optional.of(key);
        } else return Optional.empty();
    }

    static Optional<String> findInDatabase(String key) {
        System.out.println("Searching in database...");

        if (key.equals("B")) {
            return Optional.of(key);
        } else return Optional.empty();
    }

    static Optional<String> findDefault(String key) {
        System.out.println("Searching default...");

        return Optional.of("default");
    }

    static String findValue(String key) {
        System.out.println("finding value...");

        return findInCache(key)
                .or(() -> findInDatabase(key))
                .or(() -> findDefault(key))
                .get();
    }
}
