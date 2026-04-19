package Homework.Homework_7;

class Task15 {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Planet: " + planet + "; density: " + planet.getDensity());
        }
    }
}
