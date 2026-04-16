package Homework.Homework_6;

class Task9 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2005);
        Car car2 = new Car("BMW", 2017);
        Car car3 = new Car("Nissan", 1994);
        Car car4 = new Car("Toyota", 2004);
        Car car5 = new Car("Mitsubishi", 2001);

        System.out.println("Number of cars that were created: " + Car.counter);
    }
}
