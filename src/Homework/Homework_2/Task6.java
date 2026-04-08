package Homework.Homework_2;

class Task6 {
    static void mainLoop() {
        System.out.println("Podaj liczbę: ");
        int n = Input.sc.nextInt();
        Input.sc.nextLine();

        countdownToZeroFromNumber(n);
        System.out.println();
    }

    private static void countdownToZeroFromNumber(int input) {
        if (input == 0) {
            System.out.println("Podaj liczbę inną od 0");
        } else if (input > 0) {
            while (input != -1) {
                System.out.print(input + " ");
                input--;
            }
        } else {
            while (input != 1) {
                System.out.print(input + " ");
                input++;
            }
        }
    }
}
