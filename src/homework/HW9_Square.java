package homework;

public class HW9_Square {
    private int storonaA;
    private int diagonalD;

    public HW9_Square() {

    }

    public HW9_Square(int a) {
        storonaA = a;
    }

    public void setStoronaA(int newA) {
        storonaA = newA;
    }

    public int getStoronaA() {
        return storonaA;
    }

    public void setDiagonalD(int newD) {
        diagonalD = newD;
    }

    public int getDiagonalD() {
        return diagonalD;
    }

    public static void perimetrSquare(int a) {
        System.out.println("Периметр квадрата равен: " + (a * 4));
    }
    public static void ploshadSquare(int a){
        System.out.println("Площадь квадрата равна: " + (a * a));
    }
}
