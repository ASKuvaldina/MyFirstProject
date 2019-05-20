package lesson11;

public class Monkey extends ZooAnimal {
    public Monkey() {
    }

    public Monkey(int cost, int weight) {
        super(cost, weight);
    }

    @Override
    public void voice() {
        System.out.println("YYayayayya");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Обезьяна стоит " + this.getCost());
    }

    @Override
    public void printWeight() {
        System.out.println("Обезьяна весит " + this.getWeight());
    }
}
