package lesson18;

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
            System.out.println(key + " : " + table.get(key));
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
        System.out.println("Команда победитель" + victoryComand + " набрала " + victoryBall + " очков!");
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

    public void sortByValue() {
        LinkedList<HashMap.Entry<String, Integer>> tableInList = new LinkedList<HashMap.Entry<String, Integer>>(table.entrySet());
        Collections.sort(tableInList, new CompareHightToLowBall());
        ValueComparator


    }

}
