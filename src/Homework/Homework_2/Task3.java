package Homework.Homework_2;

class Task3 {
    static void mainLoop() {
        int sum = 0;
        System.out.println("Podaj liczbę: ");
        int n = Input.sc.nextInt();
        Input.sc.nextLine();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Suma liczb od 1 do " + n + ":");
        System.out.println(sum);
    }
}
