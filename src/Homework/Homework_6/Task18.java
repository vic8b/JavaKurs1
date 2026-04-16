package Homework.Homework_6;

import java.math.BigDecimal;

class Task18 {
    public static void main(String[] args) {
        Product milk = new Product("Milk", new BigDecimal("2.34"));
        Product water = new Product("Water", new BigDecimal("1.64"));
        Product yoghurt = new Product("Yoghurt", new BigDecimal("3.06"));

        milk.showProduct();
        water.showProduct();
        yoghurt.showProduct();
    }
}
