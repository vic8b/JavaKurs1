package Homework.Homework_6;

class Task5 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2005);

        System.out.println("car before changes: \n" + car);
        System.out.println();

        car.changeBrand("Volvo");

        System.out.println("car after changes: \n" + car);
    }
}
