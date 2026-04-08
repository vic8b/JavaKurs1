package Homework.Homework_2;

class Task9 {
    static void mainLoop() {
        System.out.println("Podaj liczbę: ");
        int n = Input.sc.nextInt();
        Input.sc.nextLine();

        System.out.println("Tabela mnożenia: ");
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "*" + i + " =");
            int multiplication = (n * i);
            System.out.println(multiplication);
        }
    }
}
