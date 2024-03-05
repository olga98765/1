// 5) Napisz program, który dla tablicy wyników z kilkoma ocenami obliczy średnią ocen i określi odpowiedni stopień zaliczenia (np. "A", "B", "C" itp.).

import java.util.Arrays;

public class ex15 {

    public static void main(String[] args) {
        int[] grades = { 1, 2, 3 };
        int sum = Arrays.stream(grades).sum();
        int average = sum / grades.length;

        switch (average) {
            case 1:
                System.out.println("Twoja ocena to F");
                break;
            case 2:
                System.out.println("Twoja ocena to E");
                break;
            case 3:
                System.out.println("Twoja ocena to D");
                break;
            case 4:
                System.out.println("Twoja ocena to C");
                break;
            case 5:
                System.out.println("Twoja ocena to B");
                break;
            case 6:
                System.out.println("Twoja ocena to A");
                break;
            default:
                System.out.println("Podaj prawidłowe oceny");
        }

    }

}
