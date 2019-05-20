package lesson10;

public class Square extends Figura {
    private int a;

    public Square() {
    }

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void printPloshad() {
        System.out.println("Площадь квадрата: " + (a * a));
    }

    @Override
    public void printPerimetr() {
        System.out.println("Периметр квадрата: " + (a * 4));

    }
}
