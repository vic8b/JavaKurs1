package Homework.Homework_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Task13 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("product1", 129, 5),
                new Product("product2", 50, 4),
                new Product("product3", 50, 3)));

        Comparator<Product> productPriceComparator = Comparator.comparingDouble(p -> p.price);
        Comparator<Product> productRatingDescendingComparator = Comparator.comparingInt(Product::rating).reversed();

        System.out.println("Products before sorting:");
        System.out.println(products);

        products.sort(productPriceComparator.thenComparing(productRatingDescendingComparator));
        System.out.println("Products after sorting: ");
        System.out.println(products);
    }

    record Product(String name, double price, int rating) {
    }
}
