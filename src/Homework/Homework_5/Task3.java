package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task3 {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("10.56789");

        System.out.println("bd before setScale: " + bd);

        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("bd after setScale: " + bd);

    }
}
