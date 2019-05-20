package lesson9;

public class HW9_Triangle {
    private int storonaA; // задаем поля класса, по правилу инкапсуляции тип доступа private
    private int storonaB;
    private int storonaC;
    private int hightH;
    private int ugABC;
    private int ugBCA;
    private int ugCAB;

    public HW9_Triangle() { // конструктор класса пустой

    }

    public HW9_Triangle(int a, int b, int c, int h) { // необходимый нам конструктор класса, в который мы присваиваем значения переменным в этом классе, новыми переменными из мэйна
        storonaA = a;
        storonaB = b;
        storonaC = c;
        hightH = h;
    }

    public void setStoronaA(int newA) { // можем присвоить значение переменной через setter
        storonaA = newA;
    }

    public int getStoronaA() { // вызываем закрытую переменную из класса через getter
        return storonaA;
    }

    public void setStoronaB(int newB) {
        storonaB = newB;
    }

    public int getStoronaB() {
        return storonaB;
    }

    public void setStoronaC(int newC) {
        storonaC = newC;
    }

    public int getStoronaC() {
        return storonaC;
    }

    public void setHightH(int newH) {
        hightH = newH;
    }

    public int getHightH() {
        return hightH;
    }

    public void setUgABC(int newABC) {
        ugABC = newABC;
    }

    public int getUgABC() {
        return ugABC;
    }

    public void setUgBCA(int newBCA) {
        ugBCA = newBCA;
    }

    public int getUgBCA() {
        return ugBCA;
    }

    public void setUgCAB(int newCAB) {
        ugCAB = newCAB;
    }

    public int getUgCAB() {
        return ugCAB;
    }

    public static void perimetrTriangle(int a, int b, int c) { // в аргументах мы должны писать новые переменные, или переменные, существующие в классе?
        int perimetrTriangle = a + b + c;
        System.out.println("Периметр треугольника равен: " + perimetrTriangle);
    }

    public static double ploshadTriangle(int a, int h) {
        double ploshadTriangle = 0.5 * (double) (a * h);
        return ploshadTriangle;
    }
}
