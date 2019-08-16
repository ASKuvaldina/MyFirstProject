package homework;

import java.util.Comparator;
import java.util.Map;

public class CompareHightToLowBall implements Comparator<Map.Entry<String,Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getValue() != o2.getValue()){
            return o2.getValue() - o1.getValue();
        }

        return o2.getKey().compareTo(o1.getKey());
    }
}
