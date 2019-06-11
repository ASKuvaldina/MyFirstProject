package lesson16;

import java.util.Comparator;

public class CompareByRate implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getRate() != o2.getRate()){
            return o2.getRate() - o1.getRate();
        }
        if (o1.getName().equals(o2.getName())){
            return o2.getName().compareTo(o1.getName());
        }
        return o2.getPrice() - o1.getPrice();
    }
}
