package homework;

import lesson11.ZooAnimal;

public class Tiger extends ZooAnimal {

    public Tiger() {
        super();
    }

    public Tiger(int cost, int weight) {
        super(cost, weight); // вызываем из конструктора родительского класса
    }

    @Override
    public void voice() {
        System.out.println("РРРРРРР");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Тигр cтоит " + this.getCost());
    }

    @Override
    public void printWeight() {
        System.out.println("Тигр с весом " + this.getWeight());
    }
}
