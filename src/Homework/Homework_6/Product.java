package Homework.Homework_6;

import java.math.BigDecimal;

class Product {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct() {
        System.out.println("name: " + name + ", price: " + price);
    }

    public void reducePrice(BigDecimal amount) {
        this.price = price.subtract(amount);
    }

    public void reducePrice(BigDecimal amount, String reason) {
        System.out.println("Reason for reduced price: " + reason);
        this.price = price.subtract(amount);
    }
}
