package Homework.Homework_10;

import java.util.Random;
import java.util.function.Supplier;

class Task10 {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public static void main(String[] args) {
        Random random = new Random();

        Supplier<String> codeSupplier = () -> {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                int index = random.nextInt(CHARS.length());
                sb.append(CHARS.charAt(index));
            }

            return sb.toString();
        };

        String[] codes = new String[10];
        for (int i = 0; i < codes.length; i++) {
            codes[i] = codeSupplier.get();
            System.out.println(codes[i]);
        }
    }
}
