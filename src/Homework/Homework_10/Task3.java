package Homework.Homework_10;

import java.util.Scanner;
import java.util.function.Function;

class Task3 {
    public static void main(String[] args) {
        Function<String, Integer> lengthCounterWithoutSpaces = s -> s.replaceAll(" ", "").length();
        Function<String, Integer> countVowels = s -> {
            int counter = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                    counter++;
                }
            }
            return counter;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        String fromUser = scanner.nextLine();

        System.out.println("Length without spaces: " + lengthCounterWithoutSpaces.apply(fromUser));
        System.out.println("Vowels: " + countVowels.apply(fromUser));
    }
}
