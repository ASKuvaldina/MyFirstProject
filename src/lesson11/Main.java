package lesson11;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(100000);
        Tiger tiger = new Tiger(20000, 500);
        Monkey monkey1 = new Monkey(20000, 100);
        Monkey monkey2 = new Monkey(12000, 70);
        Ara popugai1 = new Ara(40000, 8);
        Ara popugai2 = new Ara(10000, 7);

        zoo.buyAnimal(tiger);
        zoo.buyAnimal(monkey1);
        zoo.buyAnimal(monkey2);
        zoo.buyAnimal(popugai1);
        zoo.buyAnimal(popugai2);

        zoo.printAnimal();
        zoo.voice();
        zoo.mostExpensive();
        zoo.summaVsehAnimals();
        //полиморфизм свойство джавы, которое проявляетсяв момент выполнения программы. Джава думает, что работает с одинаковым типом данных, а на самом деле с разными и реализует их по разному
        zoo.mostCheap();
        zoo.summaPoslePokupok();
        zoo.mostWeightAnimal();
    }
}
