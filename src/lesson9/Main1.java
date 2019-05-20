package lesson9;

public class Main1 {
    public static void main(String[] args) {
        Cat musya = new Cat(12, "Siam",15.0);// конструктор - особый метод, который вызывается после new, можем передать несколько параметров
        Cat dusya = new Cat();
        Cat lusya = new Cat();

        musya.setAge(10); // поменяли возраст
        musya.setPoroda("Dvor"); // поменяли породу
        musya.setDlinnaHvosta(4.6); // поменяли длину хвоста

        dusya.setAge(8);
        dusya.setPoroda("Dvor");
        dusya.setDlinnaHvosta(4.6);

        lusya.setAge(10);
        lusya.setPoroda("Dvor");
        lusya.setDlinnaHvosta(4.6);




    }
}
