package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task9 {
    public static void main(String[] args) {
        System.out.println("Enter price in PLN: ");
        BigDecimal pricePln = new BigDecimal(Input.sc.nextLine());

        System.out.println("Enter exchange rate (PLN > EUR): "); //e.g. 0.24
        BigDecimal exchangeRate = new BigDecimal(Input.sc.nextLine());

        BigDecimal priceEur = pricePln.multiply(exchangeRate)
                .setScale(2, RoundingMode.UP);

        System.out.println("Price converted to EUR: " + priceEur);

        Input.scannerClose();
    }
}
