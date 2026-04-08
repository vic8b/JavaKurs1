package Homework.Homework_2;

class Task20 {
    static void mainLoop() {
        System.out.println("Podaj napis: ");
        String text = Input.sc.nextLine();

        char[] charArray = text.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
