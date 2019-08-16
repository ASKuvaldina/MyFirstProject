package homework;

import lesson11.Ara;
import lesson11.Monkey;
import lesson11.Tiger;
import lesson11.Zoo;

public class Main {
    public static void main(String[] args) {
        lesson11.Zoo zoo = new Zoo(100000);
        lesson11.Tiger tiger = new Tiger(20000, 500);
        lesson11.Monkey monkey1 = new lesson11.Monkey(20000, 100);
        lesson11.Monkey monkey2 = new Monkey(12000, 70);
        lesson11.Ara popugai1 = new lesson11.Ara(40000, 8);
        lesson11.Ara popugai2 = new Ara(10000, 7);

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
