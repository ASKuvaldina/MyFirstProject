package homework;

public class Homework5_2 {
    public static void main(String[] args) {
        String firstUser = "Coffee, juice, tea, water?";
        String secondUser = "You have food?";

        String firstUserBack = new StringBuilder(firstUser).reverse().toString(); // Нашла как удалить повторяющиеся символы в строке или массиве
        firstUserBack = firstUserBack.replaceAll("(.)(?=.*\\1)", ""); // но не понимаю эту строчку
        firstUserBack = new StringBuilder(firstUserBack).reverse().toString();

        char[] firstUserArr = firstUserBack.toLowerCase().replace(" ", "").toCharArray();
        char[] secondUserArr = secondUser.toLowerCase().replace(" ", "").toCharArray();

        for (int i = 0; i < firstUserArr.length; i++) {
            for (int j = 0; j < secondUserArr.length; j++) {
                if (firstUserArr[i] == secondUserArr[j]) {
                    System.out.print(firstUserArr[i]);
                    break;
                }
            }
        }

    }
}
