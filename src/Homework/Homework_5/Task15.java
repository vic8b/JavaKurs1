package Homework.Homework_5;

class Task15 {
    public static void main(String[] args) {
        System.out.println("Enter string with multiple words and spaces: ");
        String string = Input.sc.nextLine();

        String[] stringAfterSplit = string.split(" ");
        for (String s : stringAfterSplit) {
            System.out.println(s);
        }

        Input.scannerClose();
    }
}
