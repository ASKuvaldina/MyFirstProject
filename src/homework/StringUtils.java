package homework;

public class StringUtils {

    public static String reverse(String text) {

//        char[] textToArr = text.toCharArray();
//        char[] textReverse = new char[text.length()];
//        for (int i = textToArr.length - 1; i >= 0; i--) {
//            for (int j = 0; j < textToArr.length; j++) {
//                textReverse[j] = textToArr[i];
//            }
//        }
//        String reverseText = textReverse.toString();
//        return reverseText;
        char[] textToArr = text.toCharArray();
        String textReverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            textReverse += textToArr[i];
        }
        return textReverse;
    }

    public static int countGlass(String text) {
        int countGlas = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o' || text.charAt(i) == 'i' || text.charAt(i) == 'u' || text.charAt(i) == 'e' || text.charAt(i) == 'A' || text.charAt(i) == 'U' || text.charAt(i) == 'O' || text.charAt(i) == 'I' || text.charAt(i) == 'E') {
                countGlas++;
            }
        }
        return countGlas;
    }

    public static int countSoglasnie(String text) {
        char[] arrayToText = text.toCharArray();
        char[] consonantsLetter = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM".toCharArray();
        int countConsonants = 0;
        for (int i = 0; i < arrayToText.length; i++) {
            for (int j = 0; j < consonantsLetter.length; j++) {
                if (arrayToText[i] == consonantsLetter[j]) {
                    countConsonants++;
                }
            }
        }
        return countConsonants;
    }
}
