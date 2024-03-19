// 1) Wyświetl wynik dodawania, odejmowania, mnożenia oraz dzielenia 2 wartości.

public class Ex11 {

    public static void main(String[] args) {

        final double x = 5.2;
        final double y = 10.2;

        final double add = x + y;
        System.out.println("Wynik dodawania " + add);
        
        final double sub = x - y;
        System.out.println("Wynik odejmowania " + sub);

        final double mult = x * y;
        System.out.println("Wynik mnożenia " + mult);

        final double div = x / y;
        System.out.println("Wynik dzielenia " + div);
    }
}