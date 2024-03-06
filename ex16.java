// 6) Napisz program, który sprawdza, czy dane słowo jest palindromem.
// Link: https://pl.wikipedia.org/wiki/Palindrom

public class ex16 {

    public static void main(String[] args) {
   
String text = "malindrom";
char[] textToLetters = text.toCharArray();

        System.out.println(textToLetters[0]);
if (textToLetters[0] == textToLetters[textToLetters.length-1]) {

    System.out.println("palindrom");
} else {
        System.out.println("nie palindrom");
    }
    
}

}