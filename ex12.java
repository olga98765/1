// 2) Stwórz tablicę liczb całkowitych a następnie oblicz średnią wartość.


public class ex12 {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println(average);
    }
}