package Homework.Homework_6;

class Task15 {
    public static void main(String[] args) {
        Person person1 = new Person("Andrew", 25);
        Person person2 = new Person("Jerry");
        Person person3 = new Person("Mark", 30);

        System.out.println("Number of people via class: " + Person.numberOfPeople);
        System.out.println("Number of people via object: " + person3.numberOfPeople);
        //field belongs to class, not object

        if (Person.numberOfPeople == person3.numberOfPeople) {
            System.out.println("Same value of objects from both accesses");
        } else {
            System.out.println("Different value of objects from both accesses");
        }
    }
}
