package lesson16;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(233);
        numbers.add(-12);
        numbers.add(2);
        numbers.add(4);
        for (Integer n: numbers) {
            System.out.println(n);
        }
    }

}
