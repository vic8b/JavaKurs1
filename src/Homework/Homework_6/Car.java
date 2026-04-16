package Homework.Homework_6;

class Car {
    public static int counter = 0;

    private String brand;
    private int yearOfProduction;

//    task 2:
//    public Car() {
//        this.brand = "Unknown";
//        this.yearOfProduction = 2000;
//    }

    public Car() {
        this("Unknown", 2000);
        counter++;
    }

    public Car(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        counter++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void showDifference() {
        String brand = "Renault";
        System.out.println("brand local variable: " + brand);
        System.out.println("this.brand variable: " + this.brand);
    }

    public void changeBrand(String brand) {
        this.brand = brand;
    }

    public void introduceYourself() {
        System.out.println("I am a car of brand " + brand + " from year " + yearOfProduction);
    }

    public static void classDescription() {
        System.out.println("This class represents cars.");
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nYear of production: " + yearOfProduction;
    }
}
