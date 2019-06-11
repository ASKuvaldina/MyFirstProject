package lesson16;

import java.util.Comparator;

public class CompareLowToHight implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getPrice() != o2.getPrice()){
            return o2.getPrice() - o1.getPrice();
        }
        if (o1.getName().equals(o2.getName())){
            return o2.getName().compareTo(o1.getName());
        }
        return o2.getRate() - o1.getRate();

    }
}
