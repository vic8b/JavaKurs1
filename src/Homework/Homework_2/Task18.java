package Homework.Homework_2;

class Task18 {
    private static final int EXIT = 0;

    static void mainLoop() {
        boolean exitLoop = false;
        int biggestNumber = Integer.MIN_VALUE;

        while (!exitLoop) {
            System.out.println("(" + EXIT + " aby zakończyć)");
            int n = Input.getNumberFromUser();
            if (n == EXIT) {
                exitLoop = true;
            } else if (n > biggestNumber) {
                biggestNumber = n;
            }
        }

        System.out.println("Największa wprowadzona liczba: " + biggestNumber);
    }
}
