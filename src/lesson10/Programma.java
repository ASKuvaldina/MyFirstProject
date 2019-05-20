package lesson10;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Круг");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.nextLine();
        Figura figura = null;
        if (inputFigura.equals("1")) {

            System.out.println("Введите сторону А");
            String storonaA = scanner.nextLine();
            System.out.println("Введите сторону Б");
            String storonaB = scanner.nextLine();
            System.out.println("Введите сторону С");
            String storonaC = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);
            int stC = Integer.parseInt(storonaC);

            figura = new Triangle(stA, stB, stC);

        }
        if (inputFigura.equals("2")) {

            System.out.println("Введите сторону А");
            String storonaA = scanner.nextLine();
            System.out.println("Введите сторону Б");
            String storonaB = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);

            figura = new Rectangle(stA, stB);

        }
        if (inputFigura.equals("3")) {
            System.out.println("Введите сторону А");
            String storonaA = scanner.nextLine();
            int stA = Integer.parseInt(storonaA);
            figura = new Square(stA);
        }
        if (inputFigura.equals("4")) {
            System.out.println("Введите радиус");
            String radius = scanner.nextLine();
            int rad = Integer.parseInt(radius);
            figura = new Circle(rad);
        }

        System.out.println("Периметр или площадь?");
        String inputAction = scanner.nextLine();
        if (inputAction.equals("периметр")) {
            figura.printPerimetr();
        } else {
            figura.printPloshad();
        }

    }
}
