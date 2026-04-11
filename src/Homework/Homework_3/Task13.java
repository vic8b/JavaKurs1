package Homework.Homework_3;

class Task13 {
    static void mainLoop() {
        System.out.println("Podaj napis: ");
        String string = Input.sc.nextLine();

        char[] charArray = string.toCharArray();

        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
