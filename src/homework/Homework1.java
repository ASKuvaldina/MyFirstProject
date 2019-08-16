package homework;

public class Homework1 {
    public static void main(String[] args) {
        int koshelek = 1000;
        int pizza = 230;
        int gum = 26;
        double candy = 2.5;

        int maxPizza = koshelek / pizza;
        int ost1 = koshelek - maxPizza * pizza;
        int maxGum = ost1 / gum;
        int ost2 = ost1 - maxGum * gum;
        double maxCandy = ost2 / candy;
        int c = (int) maxCandy;
        int v = (int) candy;
        int ost3 = ost2 - c * v;

        System.out.println("На эти деньги мы можем купить:");
        System.out.println("- " + maxPizza + " пиццы");
        System.out.println("- " + maxGum + " жвачки");
        System.out.println("- " + c + " конфет");
        System.out.println("Сдача с магазина: " + ost3 + " рубля.");

    }
}
