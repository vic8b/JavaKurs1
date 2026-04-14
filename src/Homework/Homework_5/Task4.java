package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter price: ");
        BigDecimal price = new BigDecimal(Input.sc.nextLine());

        System.out.println("Enter discount percentage:");
        System.out.println("(e.g. format [5% - type in 0.05])");
        BigDecimal discountPercentage = new BigDecimal(Input.sc.nextLine());

        BigDecimal priceAfterDiscount = BigDecimal.ZERO;
        priceAfterDiscount = priceAfterDiscount
                .add(price)
                .multiply(discountPercentage)
                .setScale(2, RoundingMode.UP);

        System.out.println("Price after discount: " + priceAfterDiscount);

        Input.scannerClose();
    }
}
