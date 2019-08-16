package homework;

import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Что нужно найти: периметр или площадь правильного многоугольника?");
        String action = input.next();

        if (action.equals("периметр")) {
            System.out.println("Введите количество сторон");
            double n = input.nextDouble();
            System.out.println("Введите длину стороны многоугольника ");
            double a = input.nextDouble();
            System.out.println("Периметр правильного многоугольника = " + (a*n));
        } else if (action.equals("площадь")) {
            System.out.println("Введите количество сторон");
            double n = input.nextDouble();
            System.out.println("Введите длину стороны многоугольника ");
            double a = input.nextDouble();
            System.out.println("Площадь правильного многоугольника = " + (((n*a*a)/(4*(Math.tan(Math.toRadians((Math.PI)/n)))))));
        } else {
            System.out.println("Ошибка ввода данных");
        }
    }
}
