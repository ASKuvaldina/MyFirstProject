package lesson11;

public class Ara extends ZooAnimal {

    public Ara() {
    }

    public Ara(int cost, int weight) {
        super(cost, weight);
    }

    @Override
    public void voice() {
        System.out.println("Попка дурррак");
    }

    @Override
    public void jump() {
        System.out.println("Попугай прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Попугай стоит " + this.getCost());
    }

    @Override
    public void printWeight() {
        System.out.println("Попугай с весом " + this.getWeight());
    }
}
