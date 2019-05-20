package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Table table1 = new Table(12,4,67);
        Table table3 = table1;
        Table table2 = new Table(12,4,67);
        boolean resultEquals = table1.equals(table2); // ПЕРЕОПРЕДЕЛЯЕМ
        System.out.println(resultEquals);
        System.out.println(table1.equals(table3));
        System.out.println(table1.toString());// ПЕРЕОПРЕДЕЛЯЕМ преобразовывает объект в текстv
        System.out.println(table1); // автоматически ставится tostring
        // table1.finalyze(); удаляет лишние объекты сборщиком мусора (- встроенный механизм, который автоматически удаляет объекты)


    }
}
