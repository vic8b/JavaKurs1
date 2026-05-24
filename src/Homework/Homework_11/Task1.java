package Homework.Homework_11;

import java.util.Optional;

class Task1 {
    public static void main(String[] args) {
        String testString = "abc";

        Optional<String> test1 = Optional.of(testString);
        Optional<String> test2 = Optional.ofNullable(testString);
        Optional<String> test3 = Optional.empty();

        System.out.println("test1 is present: " + test1.isPresent());
        System.out.println("test2 is present: " + test2.isPresent());
        System.out.println("test3 is present: " + test3.isPresent());

        System.out.println("test1 isEmpty(): " + test1.isEmpty());
        System.out.println("test2 isEmpty(): " + test2.isEmpty());
        System.out.println("test3 isEmpty(): " + test3.isEmpty());

        System.out.println("Optional of null: " + Optional.ofNullable(null));
        System.out.println("Optional of null: " + Optional.of(null));

        //4. Whether we want to get NPE or not
    }
}
