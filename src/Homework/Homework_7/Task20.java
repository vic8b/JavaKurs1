package Homework.Homework_7;

class Task20 {
    public static void main(String[] args) {
        Example firstExample = Example.EXAMPLE;
        Example secondExample = Example.EXAMPLE;

        System.out.println("Example 1: " + firstExample);
        System.out.println("Example 2: " + secondExample);
        System.out.println();

        System.out.println("== result: \n" + (firstExample == secondExample));
        System.out.println("equals() result: \n" + firstExample.equals(secondExample));
    }
}
