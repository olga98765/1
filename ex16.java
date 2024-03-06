// 6) Napisz program, który sprawdza, czy dane słowo jest palindromem.
// Link: https://pl.wikipedia.org/wiki/Palindrom

public class ex16 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String word = "totk";
        char[] wordToLetters = word.toCharArray();
        boolean isPalindrome;

        for (int i = 0; i < wordToLetters.length / 2; i++) {
            if (wordToLetters[i] != wordToLetters[wordToLetters.length - 1 - i]) {
                 isPalindrome = false;
                 break;

            } else {
                 isPalindrome = true;
            }
            System.out.println(isPalindrome);

        }
        // final String text = isPalindrome ? "jest palindromem" : "nie jest palindromem";
    }
}