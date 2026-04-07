package Homework.FirstHomework;

class Task3 {
    static void mainLoop() {
        System.out.println("Podaj wiek: ");
        int age = Input.sc.nextInt();
        Input.sc.nextLine();

        ageCategory(age);
    }

    private static void ageCategory(int age) {
        System.out.println("Kategoria: ");
        if (age < 12) {
            System.out.println("'Dziecko' (<12)");
        } else if (age <= 17) {
            System.out.println("'Nastolatek' (12-17)");
        } else if (age <= 64) {
            System.out.println("'Dorosły' (18-64)");
        } else {
            System.out.println("'Senior' (>= 65)");
        }
    }
}
