package lesson15;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> texts = new LinkedHashSet<>();
        texts.add("a");
        texts.add("s");
        texts.add("d");
        texts.add("a");
        texts.add("q");


        for (String t:texts) {
            System.out.println(t);
        }

    }

}
