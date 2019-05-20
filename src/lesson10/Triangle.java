package lesson10;

public class Triangle extends Figura {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void printPloshad() {
        double p = (a + b + c) / 2;
        System.out.println("Площадь треугольника: " + Math.sqrt(p * (p - (double) a) * (p - (double) b) * (p - (double) c)));
    }

    @Override
    public void printPerimetr() {
        System.out.println("Периметр треугольника: " + (a + b + c));

    }
}
