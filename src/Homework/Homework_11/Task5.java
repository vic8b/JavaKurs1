package Homework.Homework_11;

import java.util.Map;
import java.util.Optional;

class Task5 {
    public static void main(String[] args) {
        try {
            System.out.println(AppConfig.getRequired("db.url"));
            System.out.println(AppConfig.getRequired("db.password"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static class AppConfig {
        static String getRequired(String key) {
            Map<String, String> config = Map.of(
                    "db.url", "jdbc:mysql://localhost:3306/app",
                    "db.user", "admin"
            );

            return Optional.ofNullable(config.get(key))
                    .orElseThrow(() ->
                            new IllegalArgumentException("Key not found: " + key));
        }
    }
}
