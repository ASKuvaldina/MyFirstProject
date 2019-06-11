package lesson16;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<String> texts = new TreeSet<>();
        texts.add("qqqqqq");
        texts.add("aaaaaaaa");
        texts.add("rrrrrr");
        texts.add("tttt");

        for (String s: texts) {
            System.out.println(s);
        }

    }
}
