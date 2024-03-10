// 6) Napisz program, który sprawdza, czy dane słowo jest palindromem.
// Link: https://pl.wikipedia.org/wiki/Palindrom

public class ex16 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String word = "aliila";
        char[] wordToLetters = word.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < wordToLetters.length / 2; i++) {
            if (wordToLetters[i] != wordToLetters[wordToLetters.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        String text = isPalindrome ? "Podane słowo jest palindromem" : "Podane słowo nie jest palindromem";
        System.out.println(text);
    }
}