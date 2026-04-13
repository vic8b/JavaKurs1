package Homework.Homework_4;

class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter age to check: ");
        int ageFromUser = Input.sc.nextInt();

        System.out.println(ageCategory(ageFromUser));

        Input.scannerClose();
    }

    private static String ageCategory(int age) {
        if (age < 12) {
            return "Child";
        } else if (age <= 17) {
            return "Teenager";
        } else if (age <= 64) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}
