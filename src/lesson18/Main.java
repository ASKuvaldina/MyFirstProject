package lesson18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> spisok = new HashMap<>();
        spisok.put("Яблоко", 3);
        spisok.put("Слива", 6);
        spisok.put("Киви", 1);
        spisok.put("Яблоко", 5);
        spisok.put("Груша", 2);

        System.out.println(spisok.get("Киви"));
        for (Map.Entry<String,Integer> para:spisok.entrySet()){
            System.out.println(para.getKey());
            System.out.println(para.getValue());
        }
        for (String key:spisok.keySet()){
            System.out.println(key);
            System.out.println(spisok.get(key));
        }
    }
}
