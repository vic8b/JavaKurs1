package Homework.Homework_10;

import java.util.List;
import java.util.function.Consumer;

class Task8 {
    public static void main(String[] args) {
        List<String> strings = List.of("abcd", "text2", "testABC", "1234");

        Consumer<String> logger = System.out::println;

        printWithNumbers(strings, logger);
    }


    static void printWithNumbers(List<String> lines, Consumer<String> consumer) {
        for (int i = 0; i < lines.size(); i++) {
            System.out.print((i + 1) + ") ");
            consumer.accept(lines.get(i));
        }
    }
}
