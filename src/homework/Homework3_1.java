package homework;

import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Что нужно найти: периметр или площадь пятиконечной звезды?");
        String action = input.next();

        if (action.equals("периметр")) {
            System.out.println("Введите длину грани:");
            int gran = input.nextInt();
            System.out.println("Периметр звезды = " + (gran * 2 * 5));
        } else if (action.equals("площадь")) {
            System.out.println("Введите длину грани:");
            int gran = input.nextInt();
            System.out.println("Площадь звезды = " + ((double) gran * (double) gran * ((Math.cos(Math.toRadians(18))) + (2 * (Math.tan(Math.toRadians(18))) / 3))));
        } else {
            System.out.println("Ошибка ввода данных");
        }
    }
}
