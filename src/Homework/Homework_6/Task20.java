package Homework.Homework_6;

import java.math.BigDecimal;

class Task20 {
    public static void main(String[] args) {
        Product[] productsInTheShop = {
                new Product("Milk", new BigDecimal("2.34")),
                new Product("Water", new BigDecimal("1.64")),
                new Product("Yoghurt", new BigDecimal("3.06"))
        };

        Shop testShop = new Shop("Test Shop", productsInTheShop);

        testShop.showProducts();
    }
}
