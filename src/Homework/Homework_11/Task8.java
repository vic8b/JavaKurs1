package Homework.Homework_11;

import java.util.Optional;

class Task8 {
    public static void main(String[] args) {
        User user1 = new User("Ala", "ala@gmail.com");
        User user2 = new User("Bob", null);

        System.out.println("User " + user1.getName() + " email: " + getUserEmail(Optional.of(user1)));
        System.out.println("User " + user2.getName() + " email: " + getUserEmail(Optional.of(user2)));
        System.out.println("User empty email: " + getUserEmail(Optional.empty()));
    }

    static class User {
        private String name;
        private String email; // może być null

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() { return name; }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }

    static String getUserEmail(Optional<User> user) {
        return user.flatMap(User::getEmail).orElse("Email not found");

        // flatmap -> Optional<User> to Optional<String>
        // with map it would be Optional<User> to Optional<Optiona<String>>
    }
}
