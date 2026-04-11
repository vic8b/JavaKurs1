package Homework.Homework_3;

class Task8 {
    private static int counter = 0;

    static void mainLoop() {
        int arrayLength = ArraysUtils.getArrayLengthFromUser();
        int[] ints = ArraysUtils.createArrayWithValues(arrayLength);
        int x = getNumberToSearchFromUser();

        for (int i : ints) {
            if (i == x) {
                counter++;
            }
        }

        System.out.println("Liczba wystąpień wartości " + x + " to: " + counter);
    }

    private static int getNumberToSearchFromUser() {
        System.out.println("Podaj liczbę do wyszukania wystąpień:");
        int numberToSearch = Input.sc.nextInt();
        Input.sc.nextLine();

        return numberToSearch;
    }
}
