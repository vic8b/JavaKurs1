package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task1 {
    public static void main(String[] args) {
        BigDecimal bdFromString = new BigDecimal("10.50");
        BigDecimal bdFromString2 = new BigDecimal("2.25");
        System.out.println("Val 1: " + bdFromString + ", val 2: " + bdFromString2);

        BigDecimal addResult = bdFromString.add(bdFromString2);
        System.out.println(addResult);

        BigDecimal subtractResult = bdFromString.subtract(bdFromString2);
        System.out.println(subtractResult);

        BigDecimal multiplyResult = bdFromString.multiply(bdFromString2)
                .setScale(2, RoundingMode.UP);
        System.out.println(multiplyResult);

        BigDecimal divideResult = bdFromString.divide(bdFromString2, RoundingMode.UP);
        System.out.println(divideResult);
    }
}
