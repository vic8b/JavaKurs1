package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

class Task7 {
    public static void main(String[] args) {
        BigDecimal[] bdArray = {new BigDecimal("10.25"),
                                new BigDecimal("15.75"),
                                new BigDecimal("8.65")};

        System.out.println("Cart products:");
        System.out.println(Arrays.toString(bdArray));

        BigDecimal total = BigDecimal.ZERO;

        for (BigDecimal cartPos : bdArray) {
            total = total.add(cartPos)
                    .setScale(2, RoundingMode.UP);
        }

        System.out.println("Total cart value: " + total);
    }
}
