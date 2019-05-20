package lesson8;

public class Main1 {
    public static void main(String[] args) {
        String [] [] tours = {{"Greek","15000","polupansionat","7days"},
                {"Egypt","40000","hotel","14days"},
                {"Italia","41000","villa","9days"},
                {"USA","75000","hotel","7days"},
                {"USA","65000","polupansionat","6days"},};
        String country = "USA";
        TourUtils.printTourByOneCountry(tours,country);
        TourUtils.expensiveTour(tours);
        TourUtils.printSredStoimost(tours);
    }
}
