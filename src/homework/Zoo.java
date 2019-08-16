package homework;

import lesson11.ZooAnimal;

public class Zoo {
    private int money;
    private ZooAnimal[] animals = new ZooAnimal[10];

    public Zoo() {
    }

    public Zoo(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyAnimal(ZooAnimal animal) {
        if (money < animal.getCost()) {
            System.out.println("Нет денег чтобы купить животное");
            return; // остановка ВСЕГО МЕТОДА buyAnimal
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                money = money - animal.getCost();
                animals[i] = animal;
                return;
            }
        }
        System.out.println("Нет свободных клеток!!!");

    }

    public void printAnimal() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].printInfo();
            }
        }
    }

    public void voice() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].voice();
            }
        }
    }

    public void mostExpensive() {
        ZooAnimal maxCostAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null) {
                if (maxCostAnimal.getCost() < animals[i].getCost()) {
                    maxCostAnimal = animals[i];
                }
            }
        }
        System.out.println("Самое дорогое животное");
        maxCostAnimal.printInfo();
    }

    public void summaVsehAnimals() {
        int maxCostAnimals = 0;
        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null) {
                maxCostAnimals += animals[i].getCost();

            }

        }
        System.out.println("Cтоимость животных в зоопарке " + maxCostAnimals);
    }

    public void mostCheap() {
        ZooAnimal minCostAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null) {
                if (minCostAnimal.getCost() > animals[i].getCost()) {
                    minCostAnimal = animals[i];
                }
            }
        }
        System.out.println("Самое дешевое животное");
        minCostAnimal.printInfo();
    }

    public void summaPoslePokupok() {
        System.out.println("Сумма после покупок животных: " + money);
    }

    public void mostWeightAnimal() {
        ZooAnimal maxWeightAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (maxWeightAnimal.getWeight() < animals[i].getWeight()) {

                    maxWeightAnimal = animals[i];
                }

            }
        }
        System.out.println("Самое тяжелое животное: ");
        maxWeightAnimal.printWeight();

    }
}
