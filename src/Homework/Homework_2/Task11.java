package Homework.Homework_2;

class Task11 {
    static void mainLoop() {
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
