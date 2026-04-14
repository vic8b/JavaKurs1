package Homework.Homework_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Task19 {
    public static void main(String[] args) {
        System.out.println("Enter a total bill amount:");
        BigDecimal bill = new BigDecimal(Input.sc.nextLine());

        System.out.println("Enter number of people:");
        int numberOfPeople = Input.sc.nextInt();
        Input.sc.nextLine();

        BigDecimal splitBill = bill.divide(BigDecimal.valueOf(numberOfPeople), 2, RoundingMode.UP);
        System.out.println("Each person pays: " + splitBill);

        Input.scannerClose();
    }
}
