package Homework.Homework_4;

class Task1 {
    public static void main(String[] args) {
        String nameFromUser = getNameFromUser();
        welcomePrompt(nameFromUser);

        Input.scannerClose();
    }

    private static String getNameFromUser() {
        System.out.println("Enter name: ");
        return Input.sc.nextLine();
    }

    private static void welcomePrompt(String name) {
        System.out.println("Hello, " + name);
    }
}
