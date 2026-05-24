package Homework.Homework_10;

import java.util.Scanner;
import java.util.function.BiPredicate;

class Task7 {
    public static void main(String[] args) {
        BiPredicate<String, String> sameIgnoreCase = String::equalsIgnoreCase;
        BiPredicate<String, String> isSuffix = String::endsWith;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String s2 = sc.nextLine();

        System.out.println("sameIgnoreCase: " + sameIgnoreCase.test(s1, s2));
        System.out.println("isSuffix: " + isSuffix.test(s1, s2));
    }
}
