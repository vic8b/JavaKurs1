package Homework.Homework_2;

class Task2 {
    static void mainLoop() {
        System.out.println("Podaj liczbę: ");
        int n = Input.sc.nextInt();
        Input.sc.nextLine();
        System.out.println("Liczby parzyste od 0 do " + n + ":");

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
