package Homework.FirstHomework;

class Task4 {

    public static void mainLoop() {
        System.out.println("Podaj temperaturę w stopniach Celsjusza: ");
        // for simplicity, I've chosen int
        int temp = Input.sc.nextInt();
        Input.sc.nextLine();

        tempInfo(temp);
    }

    private static void tempInfo(int temp) {
        if (temp < 0) {
            System.out.println("Mróz");
        } else if (temp <= 15) {
            System.out.println("Chłodno");
        } else if (temp <= 25) {
            System.out.println("Ciepło");
        } else {
            System.out.println("Gorąco");
        }
    }
}
