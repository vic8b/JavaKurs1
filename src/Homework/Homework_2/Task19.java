package Homework.Homework_2;

class Task19 {
    private static int gradesSum = 0;
    private static int gradesNumber = 0;

    static void mainLoop() {
        System.out.println("Podaj liczbę ocen:");
        gradesNumber = getNumberFromUser();

        getGradesFromUser();
        countAndPrintAverage();
    }

    private static void countAndPrintAverage() {
        double average = (double)gradesSum / gradesNumber;
        System.out.println("Średnia ocen: " + average);
    }

    private static void getGradesFromUser() {
        for (int i = 0; i < gradesNumber; i++) {
            System.out.println("Podaj ocenę: (" + (i+1) + "/" + gradesNumber + ")");
            int grade = getNumberFromUser();
            gradesSum += grade;
        }
    }

    private static int getNumberFromUser() {
        int number = Input.sc.nextInt();
        Input.sc.nextLine();
        return number;
    }
}
