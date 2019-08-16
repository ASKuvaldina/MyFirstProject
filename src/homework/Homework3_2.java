package homework;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Что нужно найти: периметр или площадь сектора круга?");
        String action = input.next();

        if (action.equals("периметр")) {
            System.out.println("Введите радиус круга");
            int rad = input.nextInt();
            System.out.println("Введите центральный угол ( в градусах)");
            int ug = input.nextInt();
            System.out.println("Периметр  сектора круга = " + ((((Math.PI) * (double) ug) / 180) * (double) rad + 2 * (double) rad));
        } else if (action.equals("площадь")) {
            System.out.println("Введите радиус круга");
            int rad = input.nextInt();
            System.out.println("Введите центральный угол ( в градусах)");
            int ug = input.nextInt();
            System.out.println("Площадь сектора круга = " + (((Math.PI) * (double) ug * (double) rad * (double) rad) / 360));
        } else {
            System.out.println("Ошибка ввода данных");
        }
    }
}
