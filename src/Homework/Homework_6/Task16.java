package Homework.Homework_6;

class Task16 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Andrew", 25),
                new Person("Jerry"),
                new Person("Mark", 30)
        };

        for (Person person : people) {
            person.introduceYourself();
            System.out.println("Is person adult?");
            System.out.println(person.isAdult());
            System.out.println();
        }
    }
}
