package Homework.Homework_3;

class Task9 {
    static void mainLoop() {
        int arrayLength = ArraysUtils.getArrayLengthFromUser();
        int[] ints = ArraysUtils.createArrayWithValues(arrayLength);
        int x = getNumberToSearchFromUser();
        boolean isFound = false;

        for (int i : ints) {
            if (i == x) {
                isFound = true;
                break;
            }
        }

        System.out.println("Liczba do wyszukania: " + x);
        System.out.println((isFound) ? "Znaleziono" : "Nie znaleziono");
    }

    private static int getNumberToSearchFromUser() {
        System.out.println("Podaj liczbę do wyszukania wystąpień:");
        int numberToSearch = Input.sc.nextInt();
        Input.sc.nextLine();

        return numberToSearch;
    }
}
