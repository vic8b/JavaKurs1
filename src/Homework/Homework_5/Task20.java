package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task20 {
    public static void main(String[] args) {
        System.out.println("Enter price:");
        BigDecimal price = new BigDecimal(Input.sc.nextLine());

        price = price.setScale(2, RoundingMode.CEILING);
        System.out.println("Rounded price:" + price);

        Input.scannerClose();
    }
}
