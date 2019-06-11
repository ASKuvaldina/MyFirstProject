package lesson16;

public class Main3 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar(120,"Мышка",5);
        Tovar tovar2 = new Tovar(990,"Клавиатура",4);
        Tovar tovar3 = new Tovar(45000,"Ноутбук",5);
        Tovar tovar4 = new Tovar(15000,"Монитор",4);
        Tovar tovar5 = new Tovar(9000,"Телефон",3);

        Magazin magazin = new Magazin();
        magazin.addTovar(tovar1);
        magazin.addTovar(tovar2);
        magazin.addTovar(tovar3);
        magazin.addTovar(tovar4);
        magazin.addTovar(tovar5);
//        magazin.printTovarsByPriceHightToLow();
//        magazin.printTovarsByPriceLowToHight();
       magazin.printTovarsByNameHightToLow();
//        magazin.printTovarsByRate();

    }
}
