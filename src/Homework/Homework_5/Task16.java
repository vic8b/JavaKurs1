package Homework.Homework_5;

class Task16 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        String text = Input.sc.nextLine();

        boolean startsWithJava = text.startsWith("Java");
        boolean endsWith2025 = text.endsWith("2025");

        System.out.println("Starts with \"Java\"?: " + startsWithJava);
        System.out.println("Ends with \"2025\"?: " + endsWith2025);

        Input.scannerClose();
    }
}
