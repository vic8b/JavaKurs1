package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task8 {
    public static void main(String[] args) {
        System.out.println("Enter number of products: ");
        int noOfProducts = Input.sc.nextInt();
        Input.sc.nextLine();

        BigDecimal totalPriceOfProducts = BigDecimal.ZERO;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < noOfProducts; i++) {
            sb.setLength(0);
            sb.append("Enter price for product ").append(i+1).append("/").append(noOfProducts);
            System.out.println(sb);
            totalPriceOfProducts = totalPriceOfProducts.add(new BigDecimal(Input.sc.nextLine()));
        }

        BigDecimal noOfProductsBd = BigDecimal.valueOf(noOfProducts);

        BigDecimal averagePrice = totalPriceOfProducts.divide(noOfProductsBd, 2, RoundingMode.UP);
        System.out.println("Average price is: " + averagePrice);

        Input.scannerClose();
    }
}
