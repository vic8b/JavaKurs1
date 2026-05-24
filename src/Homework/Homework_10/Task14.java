package Homework.Homework_10;

import java.util.List;

class Task14 {
    public static void main(String[] args) {
        PriceStrategy normal = basePrice -> basePrice;
        PriceStrategy student = basePrice -> basePrice * 0.9;
        PriceStrategy vip = basePrice -> basePrice * 0.8;
        PriceStrategy blackFriday = basePrice -> basePrice * 0.7;

        List<Double> prices = List.of(100.0, 250.0, 399.0);

        for (Double basePrice : prices) {
            System.out.println("Base price: " + basePrice);

            System.out.println("Calculation for strategy normal: " + calculatePrice(basePrice, normal));
            System.out.println("Calculation for strategy student: " + calculatePrice(basePrice, student));
            System.out.println("Calculation for strategy vip: " + calculatePrice(basePrice, vip));
            System.out.println("Calculation for strategy blackFriday: " + calculatePrice(basePrice, blackFriday));
            System.out.println();
        }
    }

    static double calculatePrice(double basePrice, PriceStrategy strategy) {
        return strategy.apply(basePrice);
    }

    @FunctionalInterface
    interface PriceStrategy {
        double apply(double basePrice);
    }
}
