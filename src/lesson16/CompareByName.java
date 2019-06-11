package lesson16;

import java.util.Comparator;

public class CompareByName implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {

        if (o1.getName().equals(o2.getName())){
            return o1.getName().compareTo(o2.getName());
        }
        if (o1.getPrice() != o2.getPrice()){
            return o2.getPrice() - o1.getPrice();
        }

        return o2.getRate() - o1.getRate();
    }
}
