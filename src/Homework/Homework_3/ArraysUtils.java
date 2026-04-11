package Homework.Homework_3;

class ArraysUtils {
    static int getArrayLengthFromUser() {
        System.out.println("Podaj długość tablicy: ");
        int arrayLength = Input.sc.nextInt();
        Input.sc.nextLine();
        return arrayLength;
    }

    static int[] createArrayWithValues(int arrayLength) {
        int[] ints = new int[arrayLength];
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Podaj element " + (i + 1) + "/" + ints.length + " tablicy");
            ints[i] = Input.sc.nextInt();
            Input.sc.nextLine();
        }
        return ints;
    }
}
