package Homework.Homework_6;

class Person {
    public static int numberOfPeople = 0;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }

    public Person(String name) {
        this(name, 0);
    }

//    task13:
//    public Person(String name) {
//        this.name = name;
//        age = 0;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduceYourself() {
        System.out.println(name + " " + age);
    }

    public void introduceYourself(String greeting) {
        System.out.println(greeting + " " + name + " " + age);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public int compareAge(Person other) {
        return Math.abs(age - other.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
