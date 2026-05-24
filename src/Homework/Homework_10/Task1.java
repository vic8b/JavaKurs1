package Homework.Homework_10;

class Task1 {
    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Start of program");
        Runnable runnable2 = () -> System.out.println("End of program");

        runnable1.run();
        new Thread(runnable2).start();
    }
}
