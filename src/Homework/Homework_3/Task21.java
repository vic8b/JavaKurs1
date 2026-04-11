package Homework.Homework_3;

class Task21 {
    static void mainLoop() {
        System.out.println("Podaj dowolne zdanie:");
        String userString = Input.sc.nextLine();
        boolean isPalindrom = isPalindrom(userString);

        if (isPalindrom) {
            System.out.println("Zdanie jest palindromem");
        } else {
            System.out.println("Zdanie nie jest palindromem");
        }
    }

    private static boolean isPalindrom(String s) {
        s = s.toLowerCase().replace(" ", "");

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return s.equals(reversed);
    }
}
