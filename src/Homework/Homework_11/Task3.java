package Homework.Homework_11;

import java.util.List;
import java.util.Optional;

class Task3 {
    public static void main(String[] args) {
        List<String> cityCodes = List.of("WA", "XX");

        for (String cityCode : cityCodes) {
            System.out.println("City code: " + cityCode);
            System.out.println(getCityOrDefault(cityCode));
            System.out.println();
        }

        System.out.println("Null test");
        getCityOrDefault(null);
        //null throws NPE
    }

    static String getCityOrDefault(String code) {
        Optional<String> cityByCode = findCityByCode(code);

        return cityByCode.orElse("Unknown city");
    }

    static Optional<String> findCityByCode(String code) {
        switch (code) {
            case "WA" -> {
                return Optional.of("Warsaw");
            }
            case "KR" -> {
                return Optional.of("Kraków");
            }
            case "GD" -> {
                return Optional.of("Gdańsk");
            }
            default -> {
                return Optional.empty();
            }
        }
    }
}
