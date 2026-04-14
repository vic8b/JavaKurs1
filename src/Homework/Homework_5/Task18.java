package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task18 {
    public static void main(String[] args) {
        System.out.println("Enter products quantity:");
        int quantityOfProducts = Input.sc.nextInt();
        Input.sc.nextLine();

        BigDecimal[] prices = new BigDecimal[quantityOfProducts];

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter price: ");
            prices[i] = new BigDecimal(Input.sc.nextLine());
        }

        for (BigDecimal price : prices) {
            printPriceFormatted(price);
        }

        Input.scannerClose();
    }

    private static void printPriceFormatted(BigDecimal price) {
        price = price.setScale(2, RoundingMode.UP);
        System.out.println(price + " zł");
    }
}
