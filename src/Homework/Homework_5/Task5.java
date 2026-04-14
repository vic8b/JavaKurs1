package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter net price: ");
        BigDecimal price = new BigDecimal(Input.sc.nextLine());

        BigDecimal vat = new BigDecimal("0.23");

        BigDecimal gross = price //adding net
                .add(price.multiply(vat)) //adding VAT
                .setScale(2, RoundingMode.UP); //round up

        System.out.println("gross price: " + gross);

        Input.scannerClose();
    }
}
