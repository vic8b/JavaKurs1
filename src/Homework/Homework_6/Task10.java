package Homework.Homework_6;

class Task10 {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota", 2005),
                new Car("BMW", 2017),
                new Car("Nissan", 1994)
        };

        System.out.println("All cars from array in a loop");
        for (Car car : cars) {
            System.out.println(car);
            System.out.println();
        }
    }
}
