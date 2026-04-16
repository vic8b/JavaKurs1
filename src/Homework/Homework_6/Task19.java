package Homework.Homework_6;

import java.math.BigDecimal;

class Task19 {
    public static void main(String[] args) {
        Product milk = new Product("Milk", new BigDecimal("2.34"));

        milk.showProduct();
        System.out.println();

        System.out.println("Price reduced (BigDecimal)");
        milk.reducePrice(new BigDecimal("1.02"));
        milk.showProduct();
        System.out.println();

        System.out.println("Price reduced (BigDecimal and String)");
        milk.reducePrice(new BigDecimal("0.32"), "Short expiration date");
        milk.showProduct();
    }
}
