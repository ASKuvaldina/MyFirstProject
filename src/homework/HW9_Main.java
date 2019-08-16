package homework;

import lesson9.HW9_Circle;
import lesson9.HW9_Rectangle;
import lesson9.HW9_Square;
import lesson9.HW9_Triangle;

public class HW9_Main {
    public static void main(String[] args) {
        HW9_Triangle triangle = new HW9_Triangle(4, 7, 6, 5);
        triangle.setStoronaB(4);
        HW9_Triangle.perimetrTriangle(triangle.getStoronaA(), triangle.getStoronaB(), triangle.getStoronaC());
        double ploshadTriangle = HW9_Triangle.ploshadTriangle(triangle.getStoronaA(), triangle.getHightH());
        System.out.println("Площадь треугольника равна: " + ploshadTriangle);

        System.out.println();

        HW9_Square square = new HW9_Square(7);
        square.setStoronaA(8);
        HW9_Square.perimetrSquare(square.getStoronaA());
        HW9_Square.ploshadSquare(square.getStoronaA());

        System.out.println();

        HW9_Rectangle rectangle = new HW9_Rectangle(2,14);
        rectangle.setStoronaA(5);
        HW9_Rectangle.perimetrRectangle(rectangle.getStoronaA(),rectangle.getStoronaB());
        HW9_Rectangle.ploshadRectangle(rectangle.getStoronaA(),rectangle.getStoronaB());

        System.out.println();

        lesson9.HW9_Circle circle = new lesson9.HW9_Circle(5);
        circle.setDiametr(12);
        lesson9.HW9_Circle.perimetrCircle(circle.getDiametr());
        HW9_Circle.ploshadCircle(circle.getRadius());


    }

}
