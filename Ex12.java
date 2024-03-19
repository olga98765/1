// 2) Stwórz tablicę liczb całkowitych a następnie oblicz średnią wartość.

public class Ex12 {

    public static void main(String[] args) {

        int[] numbers = { 10, 2, 3, 4, 5, 6 };
        int sum = 0;
        String text = "Średnia to: ";
        for (int number : numbers) {
            sum += number;
        }

        final double average = (double) sum / numbers.length;
        System.out.println(text + average);
    }
}
