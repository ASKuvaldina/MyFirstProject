package homework;


import lesson18.Tournir;

public class Main1 {
    public static void main(String[] args) {
        lesson18.Tournir tournir = new Tournir();
        tournir.addCommand("Динамо",33);
        tournir.addCommand("Спартак",49);
        tournir.addCommand("ЦСКА",51);
        tournir.addCommand("Рубин",36);
        tournir.addCommand("Зенит",64);
        tournir.addCommand("Ростов",41);
        tournir.addCommand("Арсенал Тула",46);
        tournir.addCommand("Локомотив",56);
        tournir.addCommand("Оренбург",43);
        tournir.addCommand("Краснодар",56);
        tournir.addCommand("Ахмат",42);
        tournir.addCommand("Урал",38);
        tournir.addCommand("Крылья Советов",28);

        tournir.printSortByComparator();
        tournir.printVictoryComand();
//        tournir.minusBal("Рубин",78);
//        tournir.printTable();
        tournir.printSredniyBall();
    }
}
