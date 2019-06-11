package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class Magazin {
    private HashSet<Tovar> tovars = new HashSet<>();

    public Magazin() {
    }
    public void addTovar (Tovar tovar){
        tovars.add(tovar);
    }

    public void printTovarsByPriceHightToLow (){
        TreeSet<Tovar> tovarsHiToLow = new TreeSet<>(new CompareHightToLow());
        tovarsHiToLow.addAll(tovars);
        for (Tovar tovar:tovarsHiToLow) {
            System.out.println(tovar);
        }
    }
    public void printTovarsByPriceLowToHight (){
        TreeSet<Tovar> tovarsLowToHight = new TreeSet<>(new CompareLowToHight());
        tovarsLowToHight.addAll(tovars);
        for (Tovar tovar:tovarsLowToHight) {
            System.out.println(tovar);
        }
    }
    public void printTovarsByNameHightToLow (){
        TreeSet<Tovar> tovarsNameHiToLow = new TreeSet<>(new CompareByName());
        tovarsNameHiToLow.addAll(tovars);
        for (Tovar tovar:tovarsNameHiToLow) {
            System.out.println(tovar);
        }

    }
    public void printTovarsByRate (){
        TreeSet<Tovar> tovarsByRate = new TreeSet<>(new CompareByRate());
        tovarsByRate.addAll(tovars);
        for (Tovar tovar:tovarsByRate) {
            System.out.println(tovar);
        }

    }



}
