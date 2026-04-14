package Homework.Homework_5;

class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        String string = Input.sc.nextLine();

        System.out.println("Length: " + string.length());
        System.out.println("UpperCase: " + string.toUpperCase());
        System.out.println("LowerCase: " + string.toLowerCase());
        System.out.println("Reversed: " + new StringBuilder(string).reverse());

        Input.scannerClose();
    }
}
