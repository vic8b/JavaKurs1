package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task17 {
    public static void main(String[] args) {
        System.out.println("Enter product name: ");
        String productName = Input.sc.nextLine();

        System.out.println("Enter its price: ");
        BigDecimal price = new BigDecimal(Input.sc.nextLine())
                .setScale(2, RoundingMode.UP);

        StringBuilder sb = new StringBuilder();
        sb.append("Product: ")
                .append(productName.toUpperCase())
                .append(", price: ")
                .append(price)
                .append(" PLN");

        System.out.println(sb);

        Input.scannerClose();
    }
}
