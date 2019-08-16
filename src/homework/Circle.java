package homework;

import lesson10.Figura;

public class Circle extends Figura {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void printPloshad() {
        System.out.println("Площадь круга: " + (Math.PI * radius * radius));
    }

    @Override
    public void printPerimetr() {
        System.out.println("Длина окружности: " + (2 * Math.PI * radius));

    }
}
