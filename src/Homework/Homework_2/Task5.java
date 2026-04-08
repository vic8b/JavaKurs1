package Homework.Homework_2;

class Task5 {
    static void mainLoop() {
        System.out.println("Podaj napis: ");
        String input = Input.sc.nextLine();

        int markdown = -1;
        char[] split = input.toCharArray();
        for (int i = 0; i < split.length; i++) {
            if (split[i] == 'a') {
                markdown = i;
                break;
            }
        }
        
        if (markdown == -1) {
            System.out.println("Nie ma litery 'a' w słowie " + input);
        } else {
            System.out.println("Pozycja pierwszej litery 'a' w słowie " + input + ": " + (markdown+1));
        }
    }
}
