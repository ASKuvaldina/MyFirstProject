package homework;

public class HW9_Rectangle {
    private int storonaA;
    private int storonaB;

    public HW9_Rectangle() {

    }

    public HW9_Rectangle(int a, int b) {
        storonaA = a;
        storonaB = b;
    }

    public void setStoronaA(int newA) {
        storonaA = newA;
    }

    public int getStoronaA() {
        return storonaA;
    }

    public void setStoronaB(int newB) {
        storonaB = newB;
    }

    public int getStoronaB() {
        return storonaB;
    }

    public static void perimetrRectangle(int a, int b) {
        System.out.println("Периметр прямоугольника равен: " + (a * 2 + b * 2));
    }

    public static void ploshadRectangle(int a, int b) {
        System.out.println("Площадь прямоугольника равна: " + (a * b));
    }
}
