package Homework.Homework_5;

class Task13 {
    public static void main(String[] args) {
        System.out.println("Enter sentence: ");
        String sentence = Input.sc.nextLine();

        String replacedString = sentence.replace(" ", "_").replace(",", "");
        System.out.println("Replaced sentence: " + replacedString);

        Input.scannerClose();
    }
}
