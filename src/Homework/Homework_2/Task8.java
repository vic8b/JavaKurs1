package Homework.Homework_2;

class Task8 {
    static void mainLoop() {
        // not sure if I got the task right??

        boolean isPositive = false;
        System.out.println("Podaj liczbę: ");

        do {
            int input = Input.sc.nextInt();
            Input.sc.nextLine();
            System.out.println("Podaj liczbę dodatnią");
            if (input > 0) {
                isPositive = true;
            }

        } while (!isPositive);
    }
}
