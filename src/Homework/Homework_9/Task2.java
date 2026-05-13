package Homework.Homework_9;

class Task2 {
    public static void main(String[] args) {
        //Exception in thread "main" Homework.Homework_9.InvalidNumberException: Invalid number: '<abc>'
        //Caused by: java.lang.NumberFormatException: For input string: "abc"
        System.out.println(NumberParser.parsePositiveInt("abc"));

        System.out.println(NumberParser.parsePositiveInt("2"));

        //Exception in thread "main" java.lang.IllegalArgumentException: non-positive: -2
        System.out.println(NumberParser.parsePositiveInt("-2"));
    }
}
