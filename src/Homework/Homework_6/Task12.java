package Homework.Homework_6;

class Task12 {
    public static void main(String[] args) {
        Person person = new Person("Andrew", 25);

        System.out.println("introduceYourself()");
        person.introduceYourself();
        System.out.println("introduceYourself(String greeting)");
        person.introduceYourself("Welcome");
    }
}
