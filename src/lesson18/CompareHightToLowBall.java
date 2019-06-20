package lesson18;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CompareHightToLowBall implements Comparator<HashMap.Entry<String,Integer>> {
    Map base;
    public ValueComparator(Map base) {
        this.base = base;
    }

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if((Integer)base.get(o1) < (Integer)base.get(o2)) {
            return 1;
        } else if((Integer)base.get(o1) == (Integer)base.get(o2)) {
            return 0;
        } else {
            return -1;
        }
    }
}
