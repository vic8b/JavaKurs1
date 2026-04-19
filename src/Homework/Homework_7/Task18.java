package Homework.Homework_7;

class Task18 {
    public static void main(String[] args) {
        Product[] products = {
                new Product("milk", Category.FOOD),
                new Product("macbook", Category.ELECTRONICS),
                new Product("t-shirt", Category.CLOTHING)
        };

        System.out.println("Products in an array of products");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
