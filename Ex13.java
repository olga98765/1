// 3) Wyświetl, czy dana liczba jest parzysta czy nieparzysta.

public class Ex13 {

    public static void main(String[] args) {
        int number = -3;

        String message = (number % 2 == 0) ? "parzysta" : "nieparzysta";
        System.out.println(message);

    }
}