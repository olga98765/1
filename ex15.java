// 5) Napisz program, który dla tablicy wyników z kilkoma ocenami obliczy średnią ocen i określi odpowiedni stopień zaliczenia (np. "A", "B", "C" itp.).

import java.util.Arrays;

public class ex15 {

    public static void main(String[] args) {
        int[] grades = { 1, 1, 1 };
        int sum = Arrays.stream(grades).sum();
        int average = sum / grades.length;

        System.out.println(average);
    }

}
