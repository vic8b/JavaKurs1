package Homework.FirstHomework;

class Task1 {
    private static final int AGE_OF_MAJORITY = 18;

    static void mainLoop() {
        int age = getAgeFromUser();

        checkUserAge(age);
    }

    private static int getAgeFromUser() {
        System.out.println("Podaj wiek:");
        int age = Input.sc.nextInt();
        Input.sc.nextLine();
        return age;
    }

    private static void checkUserAge(int age) {
        if (age >= AGE_OF_MAJORITY) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
    }
}
