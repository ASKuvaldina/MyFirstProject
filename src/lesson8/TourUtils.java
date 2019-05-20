package lesson8;

public class TourUtils {
    public static void printTourByOneCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0].equals(country)) {
                System.out.println(tours[i][0] + " " + tours[i][1] + " " + tours[i][2] + " " + tours[i][3]);
            }
        }
    }

    public static void expensiveTour(String[][] tours) {
        int maxPrice = 0;
        for (int i = 0; i < tours.length; i++) {
            int priceNum = Integer.parseInt(tours[i][1]);
            if (priceNum > maxPrice) {
                maxPrice = priceNum;
            }
        }
        System.out.println("Стоимость самого дорогого тура - " + maxPrice);
    }
    public static void printSredStoimost(String[][] tours) {
        int summaTour = 0;
        for (int i = 0; i < tours.length; i++) {

            int priceNum = Integer.parseInt(tours[i][1]);
            summaTour += priceNum;
        }
        int sredStoim = summaTour/tours.length;
        System.out.println("Средняя стоимость:" +sredStoim);
    }
}
