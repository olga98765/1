// 1) Wyświetl wynik dodawania, odejmowania, mnożenia oraz dzielenia 2 wartości.

public class ex11 {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        int add = x + y;
        System.out.println(add);
        
        int sub = x - y;
        System.out.println(sub);

        int mult = x * y;
        System.out.println(mult);

        double div = (double) x / y;
        System.out.println(div);
    }
}