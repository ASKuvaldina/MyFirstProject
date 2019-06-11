package lesson18;

public class Main1 {
    public static void main(String[] args) {
        Tournir tournir = new Tournir();
        tournir.addCommand("Динамо",33);
        tournir.addCommand("Спартак",49);
        tournir.addCommand("Оренбург",43);
        tournir.addCommand("Рубин",36);
        tournir.addCommand("Зенит",64);
        tournir.addCommand("Ростов",41);
        tournir.addCommand("Арсенал",46);
        tournir.addCommand("Локомотив",56);
        tournir.addCommand("Краснодар",56);
        tournir.addCommand("Ахмат",42);
        tournir.addCommand("Урал",38);
        tournir.addCommand("Крылья Советов",28);
        tournir.addCommand("Уфа",26);
        tournir.addCommand("Анжи",21);



        tournir.sortByHightToLowBall();
        tournir.printTable();
        tournir.printVictoryComand();
        tournir.printSredniyBall();
    }
}
