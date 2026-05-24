package Homework.Homework_10;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

class Task9 {
    public static void main(String[] args) {
        Map<String, Integer> productToQty = new HashMap<>();
        productToQty.put("prod1", 2);
        productToQty.put("prod2", 30);
        productToQty.put("prod3", 102);
        productToQty.put("prod4", 5);

        BiConsumer<String, Integer> reporter = (product, qty) ->
                System.out.println("Product: " + product + ", quantity: " + qty);

        printReport(productToQty, reporter);
    }

    static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            consumer.accept(entry.getKey(), entry.getValue());
        }
    }
}
