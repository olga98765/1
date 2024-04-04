// 1) Wyświetl wynik dodawania, odejmowania, mnożenia oraz dzielenia 2 wartości.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex11 {

    public static void main(String[] args) {

        final double x = 5.2;
        final double y = 10.2;

        final BigDecimal mult2 = BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y));
        final BigDecimal div2 = BigDecimal.valueOf(x).divide(BigDecimal.valueOf(y),3,RoundingMode.UP);
        final BigDecimal add2 = BigDecimal.valueOf(x).add(BigDecimal.valueOf(y));
        final BigDecimal sub2 = BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y));


        System.out.println("Wynik dodawania " + add2);

        System.out.println("Wynik odejmowania " + sub2);

        System.out.println("Wynik mnożenia " + mult2);

        System.out.println("Wynik dzielenia " + div2);

    }

}
