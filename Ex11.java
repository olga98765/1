// 1) Wyświetl wynik dodawania, odejmowania, mnożenia oraz dzielenia 2 wartości.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex11 {

    public static void main(String[] args) {

        final double x = 5.2;
        final double y = 10.2;

        final BigDecimal mult = BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y));
        final BigDecimal div = BigDecimal.valueOf(x).divide(BigDecimal.valueOf(y),3,RoundingMode.UP);
        final BigDecimal add = BigDecimal.valueOf(x).add(BigDecimal.valueOf(y));
        final BigDecimal sub = BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y));


        System.out.println("Wynik dodawania " + add + "\nWynik odejmowania " + sub + "\nWynik mnożenia " + mult + "\nWynik dzielenia " + div);

    }

}
