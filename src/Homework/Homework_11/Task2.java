package Homework.Homework_11;

import java.util.List;
import java.util.Optional;

class Task2 {
    public static void main(String[] args) {
        List<String> cityCodes = List.of("WA", "PO", "GD");

        for (String cityCode : cityCodes) {
            System.out.println("Code: " + cityCode);

            Optional<String> cityByCode = findCityByCode(cityCode);
            System.out.println("is cityCode present: " + cityByCode.isPresent());

            cityByCode.ifPresent(System.out::println);
            System.out.println();
        }

        System.out.println("findCityByCode method");

    }

    static Optional<String> findCityByCode(String code) {
        return switch (code) {
            case "WA" -> Optional.of("Warsaw");
            case "KR" -> Optional.of("Kraków");
            case "GD" -> Optional.of("Gdańsk");
            default -> Optional.empty();
        };
    }
}
