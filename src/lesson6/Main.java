package lesson6;

public class Main {
    public static void main(String[] args) {
        String text = "I am, a student";
        char[] charsFromText = text.toCharArray();
        int countGlas = 0;
        int countSoglas = 0;
        int countSimvols = 0;
        for (int i = 0; i < charsFromText.length; i++) {
            char currentChar = charsFromText[i];
            if (currentChar == ' ') {
                continue;
            } else if (currentChar == 'a' || currentChar == 'o' || currentChar == 'i' || currentChar == 'u' || currentChar == 'e' || currentChar == 'A' || currentChar == 'U') {
                countGlas++;
            } else if (currentChar == '!' || currentChar == ',' || currentChar == '.' || currentChar == '7' || currentChar == '"') {
                countSimvols++;
            } else {
                countSoglas++;
            }
        }
        System.out.println("Glas - " + countGlas);
        System.out.println("Soglas - " + countSoglas);
        System.out.println("Simb - " + countSimvols);

    }
}
