package Homework.Homework_5;

class Task14 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String string1 = Input.sc.nextLine();

        System.out.println("Enter string: ");
        String string2 = Input.sc.nextLine();

        System.out.println("Equality using equalsIgnoreCase(): " + string1.equalsIgnoreCase(string2));
        System.out.println("Equality using equals(): " + string1.equals(string2));

        Input.scannerClose();
    }
}
