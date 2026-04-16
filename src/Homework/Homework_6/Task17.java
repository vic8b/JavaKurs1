package Homework.Homework_6;

class Task17 {
    public static void main(String[] args) {
        Person person1 = new Person("Andrew", 25);
        Person person2 = new Person("Mark", 30);

        System.out.println("People:");
        person1.introduceYourself();
        person2.introduceYourself();
        System.out.println("Age difference: " + person1.compareAge(person2));
    }
}
