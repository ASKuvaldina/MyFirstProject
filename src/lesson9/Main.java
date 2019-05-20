package lesson9;

public class Main {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        Phone xiaomi = new Phone();

        meizu.setPrice(10000);
        xiaomi.setPrice(8000);

        meizu.setDiagonal(5.0);
        xiaomi.setDiagonal(6.5);

        meizu.setModel("Meizu");
        xiaomi.setModel("Xiaomi");

        System.out.println(meizu.getPrice());
        System.out.println(xiaomi.getDiagonal());
        System.out.println(xiaomi.getModel());
    }
}
