package homework;

public class HW9_Circle {
    private int radius;
    private int diametr;

    public HW9_Circle() {

    }

    public HW9_Circle(int rad) {
        radius = rad;
    }

    public HW9_Circle(int rad, int diam) {
        radius = rad;
        diametr = diam;
    }

    public void setRadius(int newRad) {
        radius = newRad;
    }

    public int getRadius() {
        return radius;
    }

    public void setDiametr(int newDiam) {
        diametr = newDiam;
    }

    public int getDiametr() {
        return diametr;
    }

    public static void perimetrCircle(int d) {
        System.out.println("Периметр круга: " + (Math.PI * (double) d));
    }

    public static void ploshadCircle(int r) {
        System.out.println("Площадь круга: " + (Math.PI * (double) (r * r)));
    }
}
