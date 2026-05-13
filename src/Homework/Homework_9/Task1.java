package Homework.Homework_9;

import java.util.Arrays;

class Task1 {
    public static void main(String[] args) {
        String testPwd1 = null;
        String testPwd2 = "aaa";
        String testPwd3 = "aaaaaaaaaa";
        String testPwd4 = "aaaaaaaa2aa";

        for (String s : Arrays.asList(testPwd1, testPwd2, testPwd3, testPwd4)) {
            try {
                PasswordValidator.validate(s);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }

        }
    }
}
