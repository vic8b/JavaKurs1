package Homework.Homework_5;

import java.math.BigDecimal;

class Task10 {
    public static void main(String[] args) {
        double d1 = 0.1;
        double d2 = 0.2;
        double resultD = d1 + d2;

        System.out.println("Sum of double result: " + resultD);

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal resultBd = bd1.add(bd2);
        System.out.println("Sum of BigDecimal result: " + resultBd);

        System.out.println("Are they equal?");
        System.out.println(resultBd.equals(BigDecimal.valueOf(resultD)));


    }
}
