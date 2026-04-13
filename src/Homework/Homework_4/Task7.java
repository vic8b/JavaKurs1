package Homework.Homework_4;

class Task7 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Init value of variable: " + x);

        changeX(x);

        System.out.println("Value of variable in main: " + x);
    }

    private static void changeX(int x) {
        x = 10;
        System.out.println("Changed value of variable in method: " + x);
    }
}
