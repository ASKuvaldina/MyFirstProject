package homework;

import java.util.*;

public class Tournir {
    private HashMap<String, Integer> table = new HashMap<>();

    public void addCommand(String nameComand, int ball) {
        if (table.containsKey(nameComand)) {
            int currentBall = table.get(nameComand);
            table.put(nameComand, (ball + currentBall));
        } else {
            table.put(nameComand, ball);
        }
    }

    public void printTable() {
        for (String key : table.keySet()) {
            System.out.print(key);
            System.out.println(" - " + table.get(key));

        }
    }

    public void printVictoryComand() {
        int victoryBall = 0;
        String victoryComand = null;
        for (String key : table.keySet()) {
            if (victoryBall < table.get(key)) {
                victoryBall = table.get(key);
                victoryComand = key;
            }
        }
        System.out.println("Команда победитель " + victoryComand + " - " + victoryBall);
    }

    public void minusBal(String name, int ball) {
        if (table.containsKey(name)) {
            int currentBall = table.get(name);
            if (currentBall > ball) {
                table.put(name, (currentBall - ball));
            } else {
                table.put(name, 0);
            }
        } else {
            System.out.println("Нет такой команды");
        }
    }

    public void printSredniyBall() {
        int obshiiBall = 0;
        for (String key : table.keySet()) {
            obshiiBall = obshiiBall + table.get(key);
        }
        System.out.println("Средний балл команд: " + (double) obshiiBall / table.size());
    }

    public void printSortByComparator() {
        LinkedList<Map.Entry<String, Integer>> list = new LinkedList<>(table.entrySet());
        Collections.sort(list, new CompareHightToLowBall());
        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();

        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        String leftAlignFormat = "| %-15s | %-4d |%n";

        System.out.format("+-----------------+------+%n");
        System.out.format("| Имя клуба       | Очки |%n");
        System.out.format("+-----------------+------+%n");
        for (String key : sortedMap.keySet()) {
            System.out.format(leftAlignFormat, key, sortedMap.get(key));
        }
        System.out.format("+-----------------+------+%n");
    }

}
