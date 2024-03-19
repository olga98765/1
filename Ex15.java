// 5) Napisz program, który dla tablicy wyników z kilkoma ocenami obliczy średnią ocen i określi odpowiedni stopień zaliczenia (np. "A", "B", "C" itp.).

import java.util.Arrays;

public class Ex15 {

    public static void main(String[] args) {
        final int[] grades = { 1, 1, 3 };
        final int sum = Arrays.stream(grades).sum();
        final int average = sum / grades.length;
        final String result = "Twoja ocena to ";

        switch (average) {
            case 1:
                System.out.println(result + "F");
                break;
            case 2:
                System.out.println(result + "E");
                break;
            case 3:
                System.out.println(result + "D");
                break;
            case 4:
                System.out.println(result + "C");
                break;
            case 5:
                System.out.println(result + "B");
                break;
            case 6:
                System.out.println(result + "A");
                break;
            default:
                System.out.println("Podaj prawidłowe oceny");
        }

    }
}
