package homework;

import java.util.Scanner;

public class Homework3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Что нужно найти: периметр или площадь трапеции?");
        String action = input.next();

        if (action.equals("периметр")) {
            System.out.println("Введите основание A");
            double a = input.nextDouble();
            System.out.println("Введите основание B");
            double b = input.nextDouble();
            System.out.println("Введите боковую сторону C");
            double c = input.nextDouble();
            System.out.println("Введите боковую сторону D");
            double d = input.nextDouble();
            System.out.println("Периметр трапеции = " + (a+b+c+d));
        } else if (action.equals("площадь")) {
            System.out.println("Введите номер варианта расчета: \n 1 - по высоте и двум основаниям; \n 2 - по высоте и средней линии; \n 3 - по диагонали и углу между ними; ");
            String var = input.next();
            if (var.equals("1")) {
                System.out.println("Введите основание A");
                double a = input.nextDouble();
                System.out.println("Введите основание B");
                double b = input.nextDouble();
                System.out.println("Введите высоту трапеции");
                double h = input.nextDouble();
                System.out.println("Площадь трапеции = " + (((a+b)*h)/2));
            }
            if (var.equals("2")) {
                System.out.println("Введите среднюю линию");
                double m = input.nextDouble();
                System.out.println("Введите высоту трапеции");
                double h = input.nextDouble();
                System.out.println("Площадь трапеции = " + (m*h));
            }
            if (var.equals("3")) {
                System.out.println("Введите диагональ D1");
                double d1 = input.nextDouble();
                System.out.println("Введите диагональ D2");
                double d2 = input.nextDouble();
                System.out.println("Введите угол между диагоналями");
                double ug = input.nextDouble();
                System.out.println("Площадь трапеции = " + ((d1*d2*(Math.sin(Math.toRadians(ug))))/2));
            }

        } else {
            System.out.println("Ошибка ввода данных");
        }
    }
}
