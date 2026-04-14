package Homework.Homework_5;

import java.math.BigDecimal;

class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter price 1: ");
        BigDecimal price1 = new BigDecimal(Input.sc.nextLine());

        System.out.println("Enter price 2: ");
        BigDecimal price2 = new BigDecimal(Input.sc.nextLine());

        int comparison = price1.compareTo(price2);
        if (comparison == 0) {
            System.out.println("Prices are equal");
        } else if (comparison > 0) {
            System.out.println("First price is greater");
        } else {
            System.out.println("Second price is greater");
        }

        Input.scannerClose();
    }
}
