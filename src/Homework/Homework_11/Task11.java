package Homework.Homework_11;

import java.util.List;
import java.util.Optional;

class Task11 {
    static final UserRepository userRepo = new UserRepository();

    public static void main(String[] args) {
        int[] testIds = {1, 3, 2, 99};

        for (int testId : testIds) {
            try {
                System.out.println("Test id for id: " + testId + " result: " + getAdultNameById(userRepo, testId));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static class User {
        private int id;
        private String name;
        private int age;

        public User(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User id: " + id + ", name: " + name + ", age" + age;
        }
    }

    static class UserRepository {
        private final List<User> users = List.of(
                new User(1, "Anna", 25),
                new User(2, "Bartek", 17),
                new User(3, "Celina", 30),
                new User(4, "Dawid", 15)
        );

        Optional<User> findById(int id) {
            for (User user : users) {
                if (user.getId() == id) {
                    return Optional.of(user);
                }
            }

            return Optional.empty();
        }
    }

    static String getAdultNameById(UserRepository repo, int id) {
        return repo.findById(id)
                .filter(u -> u.getAge() >= 18)
                .map(u -> u.getName().toUpperCase())
                .orElseThrow(() -> new IllegalArgumentException("Adult not found for id: " + id));
    }
}
