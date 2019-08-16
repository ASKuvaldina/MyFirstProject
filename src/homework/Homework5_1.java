package homework;

public class Homework5_1 {
    public static void main(String[] args) {
        String text = "Hello, my names is Nastya! What`s your name?";
        char[] arrayToTextLow = text.toLowerCase().toCharArray();
        char[] vowelsLetter = "eyuioa".toCharArray();
        char[] consonantsLetter = "qwrtpsdfghjklzxcvbnm".toCharArray();
        char[] simbols = ".,/?';:|/`~<>{}[]+-=_()*^%$#@!№".toCharArray();
        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        int numberOfSimbols = 0;
        for (int i = 0; i < arrayToTextLow.length; i++) {
            for (int j = 0; j < vowelsLetter.length; j++) {
                if (arrayToTextLow[i] == vowelsLetter[j]) {
                    numberOfVowels++;
                }
            }
            for (int z = 0; z < consonantsLetter.length; z++) {
                if (arrayToTextLow[i] == consonantsLetter[z]) {
                    numberOfConsonants++;
                }
            }
            for (int y = 0; y < simbols.length; y++) {
                if (arrayToTextLow[i] == simbols[y]) {
                    numberOfSimbols++;
                }
            }
        }
        System.out.println("Количество гласных букв в тексте: " + numberOfVowels);
        System.out.println("Количество согласных букв в тексте: " + numberOfConsonants);
        System.out.println("Количество знаков препинания в тексте: " + numberOfSimbols);

    }
}
