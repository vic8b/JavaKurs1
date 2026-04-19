package Homework.Homework_7;

import java.math.BigDecimal;
import java.math.RoundingMode;

enum Planet {
    MERCURY (new BigDecimal("3.303e+23") , new BigDecimal("2.4397e6")),
    VENUS (new BigDecimal("4.869e+24") , new BigDecimal("6.0518e6") ),
    EARTH (new BigDecimal("5.976e+24"), new BigDecimal("6.37814e6")),
    MARS (new BigDecimal("6.421e+23"), new BigDecimal("3.3972e6")),
    JUPITER (new BigDecimal("1.9e+27"),   new BigDecimal("7.1492e7")),
    SATURN (new BigDecimal("5.688e+26"), new BigDecimal("6.0268e7")),
    URANUS (new BigDecimal("8.686e+25"), new BigDecimal("2.5559e7")),
    NEPTUNE (new BigDecimal("1.024e+26"), new BigDecimal("2.4746e7"));

    private final BigDecimal mass;
    private final BigDecimal radius;

    static final BigDecimal FOUR = new BigDecimal("4");
    static final BigDecimal THREE = new BigDecimal("3");
    static final BigDecimal PI = new BigDecimal(Math.PI);

    Planet(BigDecimal mass, BigDecimal radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public BigDecimal getDensity() {
        BigDecimal volume = FOUR
                .divide(THREE, 10, RoundingMode.HALF_UP)
                .multiply(PI)
                .multiply(radius.pow(3));

        return mass.divide(volume, 10, RoundingMode.HALF_UP);
    }
}
